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
		long arr[][] = new long[n+1][10];
		int i;
		long count = 0;

		for(i=1; i<10; i++) {
			arr[1][i] = 1;
		}

		for(i=2; i<n+1; i++) {
			for(int m=0; m<10; m++) {
				if(m == 0)
					arr[i][0] = arr[i-1][1]% 1000000000;
				else if(m == 9)
					arr[i][9] = arr[i-1][8]% 1000000000;
				else
					arr[i][m] = (arr[i-1][m-1] + arr[i-1][m+1]) % 1000000000;
			}
		}

		for(i = 0; i < 10; i++) {
			count += arr[n][i];
		}

		bw.write(String.valueOf(count% 1000000000));

		br.close();
		bw.close();
	}

}
