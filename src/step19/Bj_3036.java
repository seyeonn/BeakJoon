package step19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj_3036 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int d = arr[0];

		for(int i=1; i<n; i++) {
			int gcd = gcd(d,arr[i]);
			int a = d/gcd;
			int b = arr[i]/gcd;
			bw.write(a + "/" + b + "\n");
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
