package step14;

import java.io.*;
import java.util.Arrays;

public class Bj_11650 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];

		for(int i=0; i<n; i++) {
			arr[i][0] = Integer.parseInt(br.readLine());
			arr[i][1] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr,(a,b) -> {
			return Integer.compare((a[0]), (b[0]));
		});
		
		int temp;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i][0] == arr[i+1][0]) {
				if(arr[i][1] > arr[i+1][1]) {
					temp = arr[i][1];
					arr[i][1] = arr[i+1][1];
					arr[i+1][1] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++)
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");

		br.close();
		bw.close();

	}

}
