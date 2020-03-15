package step14;

import java.io.*;

public class Bj_10989 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];

		for(int i=0; i<n; i++) {
			arr[Integer.parseInt(br.readLine())]++;	
		}

		for(int i=0; i<arr.length; i++)
			if(arr[i]!=0) {
				for(int j=0; j<arr[i]; j++)
					bw.write(i + "\n");
			}
		br.close();
		bw.close();
	}

}
