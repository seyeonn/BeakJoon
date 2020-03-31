package step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj_15652 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] arr = {1,2,3,4,5,6,7,8};
	static int[] output = new int[8];
	static int s;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		s = m;

		dfs(m,0,n);

		br.close();
		bw.close();
	}

	static void dfs(int r, int d, int n) throws IOException {
		if(r == 0) {
			for(int i=0; i<s; i++)
				bw.write(output[i] + " ");
			bw.newLine();
		}
		else {
			for(int i=d; i<n; i++) {
				output[s - r] = arr[i];
					dfs(r-1,i,n);
			}

		}
	}
}
