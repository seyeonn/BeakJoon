package step18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj_11399 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {

			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int total = arr[0];
		for(int i=1; i<n; i++) {
			arr[i] += arr[i-1];
			total += arr[i];
		}

		bw.write(String.valueOf(total));
		bw.close();
		br.close();
	}

}
