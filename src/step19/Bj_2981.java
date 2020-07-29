package step19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Bj_2981 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];

		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		int val = arr[1]-arr[0];

		for(int i=2; i<arr.length; i++) {
			val = gcd(val,arr[i]-arr[i-1]);
		}

		for(int i=2; i<=val; i++) {
			if(val%i == 0)
				bw.write(String.valueOf(i) + " ");
		}

		br.close();
		bw.close();
	}

	public static int gcd(int d, int arr1) {
		if(d%arr1 == 0)
			return arr1;
		return gcd(arr1,d%arr1);
	}

}
