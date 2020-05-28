package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_1463 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] f = new int[n+1];
		f[0] = 0;
		f[1] = 0;

		for(int i=2; i<=n; i++) {
			f[i] = f[i-1] +1;
			if(i%2 == 0) {
				f[i] = Math.min(f[i/2]+1, f[i]);
			}
			if(i%3 == 0) {
				f[i] = Math.min(f[i/3]+1, f[i]);
			}
		}

		bw.write(String.valueOf(f[n]));

		br.close();
		bw.close();
	}

}
