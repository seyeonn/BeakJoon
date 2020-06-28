package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_1003 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String result;

		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(br.readLine());
			result = fibo(a) + " " + fibo(a+1);
			bw.write(result + "\n");
		}
		br.close();
		bw.close();
	}

	static int fibo(int n) throws IOException {
		int a = 1;
		int b = 0;
		int c = 1;
		if(n == 0) {
			return 1;
		}
		else if( n == 1) {
			return 0;
		}
		else {
			for(int i=1; i<=n; i++) {
				a = b;
				b = c;
				c = a+b;
			}
			return a;
		}
	}
}
