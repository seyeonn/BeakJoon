package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_2156 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int num[] = new int[n];
		int grape[] = new int[n];

		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}

		if (n == 1)
			grape[0] = num[0];
		else if (n == 2)
			grape[1] = num[0] + num[1];
		else {
			grape[0] = num[0];
			grape[1] = num[0] + num[1];
			grape[2] = Max(num[0] + num[2], Max(num[0] + num[1], num[1] + num[2]));

			for (int j = 3; j < n; j++) {
						if(grape[j - 1] > Max(grape[j - 2]+ num[j], grape[j-3] + num[j - 1] + num[j])) {
							grape[j] = grape[j - 1];
						}
						else
							grape[j] = Max(grape[j - 2]+ num[j], grape[j-3] + num[j - 1] + num[j]);
			}
		}
		bw.write(String.valueOf(grape[n - 1]));

		br.close();
		bw.close();
	}

	public static int Max(int a, int b) {
		return a > b ? a : b;
	}

}
