package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_2748 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		long[] fibo = new long[n+1];
		fibo[0] = 0;
		fibo[1] = 1;

		for(int i=2; i<=n; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}

		bw.write(String.valueOf(fibo[n]));

		br.close();
		bw.close();
	}
}
