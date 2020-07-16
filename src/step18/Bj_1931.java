package step18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj_1931 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][2];
		int count = 1;

		for(int i=0; i<n; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(str.nextToken());
			arr[i][1] = Integer.parseInt(str.nextToken());
		}

		Arrays.sort(arr, (a, b) -> {
			if (a[1] == b[1])
				return Integer.compare(a[0], b[0]);
			else
				return Integer.compare(a[1], b[1]);
		});

		int temp = 0;

		for(int i=1; i<n; i++) {
			if(arr[temp][1] <= arr[i][0]) {
				temp = i;
				count++;
			}
		}

		bw.write(String.valueOf(count));
		bw.close();
		br.close();
	}

}
