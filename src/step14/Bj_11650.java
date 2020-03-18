package step14;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj_11650 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];

		for(int i=0; i<n; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(str.nextToken());
			arr[i][1] = Integer.parseInt(str.nextToken());
		}

		Arrays.sort(arr,(a,b) -> {
			if(a[0] == b[0]) {
				return Integer.compare(a[1], b[1]);
			}
			return Integer.compare((a[0]), (b[0]));
		});
		
		
		for(int i=0; i<arr.length; i++)
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");

		br.close();
		bw.close();

	}

}
