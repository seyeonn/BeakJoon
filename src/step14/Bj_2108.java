package step14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bj_2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int aver = 0;
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			aver += arr[i];		
		}

		Arrays.sort(arr);

		bw.write(Math.round((double)aver/n)+"\n");
		bw.write(arr[n/2]+"\n");

		int[] num = new int[8001];
		int temp = 0;
		ArrayList<Integer> most = new ArrayList<>();

		for(int i=0; i<arr.length; i++) 
			num[arr[i]+4000]++;

		for(int i=0; i<num.length; i++) {
			if(temp <= num[i]) {
				if(temp < num[i]) {
					temp = num[i];
					most.clear();
					most.add(i);
				}
				else
					most.add(i);
			}
		}

		if(most.size() > 1) {
			Collections.sort(most);
			bw.write(most.get(1) - 4000 +"\n");
		}
		else
			bw.write(most.get(0) - 4000 +"\n");

		bw.write(arr[arr.length-1] - arr[0] + "\n");

		br.close();
		bw.close();
	}

}

