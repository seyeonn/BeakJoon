package step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj_14889 {
	static int n;
	static int[][] map;
	static int[] check;   //방문 배열
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		check = new int[n];

		for(int i=0; i<n; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			for (int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(str.nextToken());
			}
		}
		dfs(-1,0);
		bw.write(String.valueOf(min));   //0번 인덱스부터 시작하므로 -1 전달

		br.close();
		bw.close();

	}

	static void dfs(int start, int cnt) {
		if(cnt == n/2) {    //n/2의 사람 수 만큼 선택하면 계산 시작
			gap();          //최솟값을 계산하는 메소드
			return;
		}

		//전달받은 start+1 부터 반복해야 중복 배제 가능
		//예시로, 1 2 3 사람을 선택했을 때 계산을 완료 후
		//2 사람이 첫번째 일 때 3 사람부터 탐색하는 것
		//자연스레 1은 배제
		for(int i=start+1; i<n; i++) {
			if(check[i] == 0) {    //방문하지 않은 경우
				check[i] = 1;      //방문 처리
				dfs(i,cnt+1);      //재귀호출, 시작 값과 선택된 사람의 수
				check[i] = 0;      //백 트래킹
			}
		}
	}

	static void gap() {   //b/2 수의 사람을 선택 후 계산하는 메소드
		int start = 0;   //능력치 저장 변수
		int link = 0;
		int a[] = new int[n/2];  //선택된 사람들
		int b[] = new int[n/2];  //선택되지 않은 사람들
		int a_i = 0;   //배열에 값을 저장하기 위한 인덱스 변수
		int b_i = 0;

		for(int i=0; i<n; i++) {  //방문 배열 탐색
			if(check[i] == 1)  //선택된 사람들의 경우
				a[a_i++] = i;   //a배열에 저장
			else               //선택되지 않은 사람들의 경우
				b[b_i++] = i;   //b배열에 저장
		}

		start = divide(a);   //a와 b배열에 저장 된 사람들의 능력치 계산
		link = divide(b);

		int result = Math.abs(start-link);  //두 팀의 능력치 차이 절댓값화
		min = Math.min(result, min);        //최솟값 찾기
	}

	static int divide(int[] arr) {   //두 팀의 능력치 계산
		int result = 0;

		for(int i=0; i<arr.length; i++)  //두 사람을 선택해 능력치 계산
			for(int j=i+1; j<arr.length; j++)
				result = result + map[arr[i]][arr[j]] + map[arr[j]][arr[i]];

		return result;   //결과 리턴
	}
}
