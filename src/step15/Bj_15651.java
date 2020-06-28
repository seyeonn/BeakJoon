package step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj_15651 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[m];

		dfs(arr,0,n);

		br.close();
		bw.close();
	}

	static void dfs(int[] arr, int d, int n) throws IOException {
		if(d == arr.length) {
			for(int i=0; i<arr.length; i++)
				bw.write(arr[i] + " ");
			bw.newLine();
		}
		else {
			for(int i=1; i<=n; i++) {
					arr[d] = i;
					dfs(arr,d+1,n);
			}
		}
	}

}
