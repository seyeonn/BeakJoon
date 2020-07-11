package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj_11504 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int i;

		int arr[] = new int[n];
		int dp_f[] = new int[n];
		int dp_e[] = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (i = 0; i < n; i++) {
			dp_f[i] = 1;
			for (int j = 0; j <= i; j++) {
				if (arr[i] > arr[j] && dp_f[j] >= dp_f[i])
					dp_f[i] = dp_f[j] + 1;
			}
		}

		for (i = n-1; i >= 0; i--) {
			dp_e[i] = 1;
			for (int j = n-1; j >= i; j--) {
				if (arr[i] > arr[j] && dp_e[j] >= dp_e[i])
					dp_e[i] = dp_e[j] + 1;
			}
		}

        for (i = 0; i < n; i++) {
            dp_e[i] += dp_f[i];
        }

        Arrays.sort(dp_e);
        bw.write(String.valueOf(dp_e[n-1]-1));

		br.close();
		bw.close();

	}

}
