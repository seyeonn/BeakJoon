package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_2579 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int num[] = new int[n];
		int score[] = new int[n];

		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine());
			bw.write("\n");
		}

		num[1] = 30;

		for(int j=3; j<n; j++) {
			System.out.println(num[j]);
			score[j] = Max(num[j-1]+num[j-3],num[j-2]) + num[j];
			System.out.println("after:" + score[j]);
		}

		bw.write(String.valueOf(score[n]));

		br.close();
		bw.close();
	}

	public static int Max(int a, int b) {
		return a > b ? a : b;
	}

}
