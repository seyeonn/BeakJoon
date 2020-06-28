package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj_1149 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int rgb[][] = new int[n+1][3];

		rgb[0][0] = 0;
		rgb[0][1] = 0;
		rgb[0][2] = 0;

		for(int i=1; i<=n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<3; j++) {
				rgb[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for(int k=1; k<=n; k++) {
			rgb[k][0] = Min(rgb[k-1][1], rgb[k-1][2]) + rgb[k][0];
			rgb[k][1] = Min(rgb[k-1][0], rgb[k-1][2]) + rgb[k][1];
			rgb[k][2] = Min(rgb[k-1][0], rgb[k-1][1]) + rgb[k][2];
		}

		bw.write(String.valueOf(Min(Min(rgb[n][0],rgb[n][1]),rgb[n][2])));

		br.close();
		bw.close();
	}

	public static int Min(int a, int b) {
		return a < b ? a : b;
	}
}
