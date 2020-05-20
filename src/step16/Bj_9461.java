package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_9461 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		long tri[] = new long[101];
		tri[0] = 1;
		tri[1] = 1;
		tri[2] = 1;
		tri[3] = 2;
		tri[4] = 2;

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			for (int j = 5; j < n; j++) {
				tri[j] = tri[j - 5] + tri[j - 1];
			}

			bw.write(String.valueOf(tri[n - 1]) + "\n");

		}
		br.close();
		bw.close();
	}

}
