package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj_1932 {
	static int[][] tri;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		tri = new int[n][n];
		StringTokenizer str;

		for (int i = 0; i < n; i++) {
			str = new StringTokenizer(br.readLine());
			for (int j = 0; j <= i; j++) {
				tri[i][j] = Integer.parseInt(str.nextToken());
			}
		}

		for (int k = 1; k < n; k++) {
			for (int m = 0; m <= k; m++) {
				if (m == 0)
					tri[k][m] = tri[k - 1][0] + tri[k][m];
				else if (m == k)
					tri[k][m] = tri[k - 1][m-1] + tri[k][m];
				else
					tri[k][m] = Max(tri[k - 1][m - 1], tri[k - 1][m]) + tri[k][m];
			}
		}

		Arrays.sort(tri[n - 1]);
		bw.write(String.valueOf(tri[n - 1][n - 1]));

		br.close();
		bw.close();

	}

	public static int Max(int a, int b) {
		return a > b ? a : b;
	}

}
