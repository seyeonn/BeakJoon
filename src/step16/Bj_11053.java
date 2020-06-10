package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj_11053 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int max = 0;
		int i;

		int arr[] = new int[n];
		int dp[] = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dp[0] = 1;

		for (i = 1; i < n; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dp[j] >= dp[i])
					dp[i] = dp[j] + 1;
				else if (arr[i] == arr[j])
					dp[i] = dp[j];
			}


		}

		for(i=0; i<n; i++)
			if (max < dp[i])
				max = dp[i];

		bw.write(String.valueOf(max));

		br.close();
		bw.close();

	}

}
