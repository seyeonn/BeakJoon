package step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj_2580 {
	static int[][] sdoku = new int[9][9];
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				sdoku[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		back(0,0);

	}

	static void back(int row, int col) throws IOException {
		if(col == 9) {
			col = 0;
			row++;
		}
		if(row == 9) {
			for(int i=0; i<sdoku.length; i++) {
				for(int j=0; j<sdoku[i].length; j++)
					bw.write(sdoku[i][j] + " ");
				bw.newLine();
			}
			bw.close();
			System.exit(0);
		}
		if(sdoku[row][col] == 0) {  //값이 0일 경우
			for(int i=1; i<10; i++) {  //1부터 9까지 임의로 수 대입
				if(isPossible(row,col,i)) {   //겹치는 수가 없는 조건에 만족하면
					sdoku[row][col] = i;   //임의의 값 채워넣기
					back(row,col+1);       //다음 칸에 들어갈 값이 있는지 확인
					sdoku[row][col] = 0;   //백트래킹
				}
			}
		}
		else
			back(row,col+1);  //0이 아니면 탐색
	}

	static boolean isPossible(int row, int col, int i) {
		for(int j =0; j<9; j++) {
			if(sdoku[row][j] == i)    //해당 행에 i값이 존재한다면, false
				return false;
			if(sdoku[j][col] == i)    //해당 열에 i값이 존재한다면, false
				return false;
		}

		if(!checkSquare(row,col,i))  //해당 3*3 사각형안에 i값이 존재한다면, false
			return false;

		return true;   //모든 조건이 충족하지 않을 경우 true
	}

	static boolean checkSquare(int row, int col, int i) {  //3*3 사각형안에 i값이 있는지 없는지 확인하는 메소드
		row = (row/3)*3;
		col = (col/3)*3;

		for(int j=row; j<row+3; j++) {
			for(int k = col; k<col+3; k++) {
				if(sdoku[j][k] == i)
					return false;
			}
		}
		return true;
	}
}
