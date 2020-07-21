package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Bj_2565 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[n][2];
		int dp[] = new int[n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
		for(int i=0; i<n; i++) {
			dp[i] = 1;
			for(int j=0; j<=i; j++) {
				if (arr[i][1] > arr[j][1] && dp[j]+1 > dp[i]) {
					dp[i] = dp[j] + 1;
				}
			}
		}

		Arrays.sort(dp);

		bw.write(String.valueOf(n-dp[n-1]));
		bw.close();
		br.close();


	}

}
