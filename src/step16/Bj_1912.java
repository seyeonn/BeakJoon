package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj_1912 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int dp[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];

        for (int i = 1; i < n; i++) {
        	dp[i] = arr[i];
			for (int j = i-1; j < i; j++) {
				if (dp[i] + dp[j] > dp[i])
					dp[i] += dp[j];
			}
		}

        Arrays.sort(dp);
        bw.write(String.valueOf(dp[n - 1]));
        bw.close();
	}

}
