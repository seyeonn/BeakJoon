package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_10844 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		long arr[][] = new long[101][10];

		for(int i=1; i<101; i++) {
			for(int m=0; m<10; m++) {
				arr[1][m] = 1;
				if(m == 0)
					arr[i][0] = arr[i-1][1];
				if(m == 9)
					arr[i][9] = arr[i-1][8];
				arr[i][m] = arr[i-1][m-1] + arr[i-1][m+1];
			}
		}

		bw.write(String.valueOf(arr[n][n]));

		br.close();
		bw.close();
	}

}
