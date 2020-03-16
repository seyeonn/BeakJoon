package step14;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Bj_2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(br.readLine());

		bw.write(String.valueOf(aver(n,arr))+"\n");
		bw.write(String.valueOf(cen(n,arr))+"\n");
		bw.write(String.valueOf(count(n,arr))+"\n");
		bw.write(String.valueOf(dis(n,arr))+"\n");
		br.close();
		bw.close();
	}
	
	static int aver (int n, int[] arr) {
		int sum = 0;
		
		for(int i=0; i<arr.length; i++)
			sum += arr[i];
		
		return sum/n;
	}
	
	static int cen (int n, int[] arr) {
		int temp;
		for(int i=0; i<arr.length-1; i++) {
			for(int j =0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		int middle = arr.length/2;
		
		return arr[middle];
	}

	static int count (int n, int[] arr) {
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
			return most.get(1) - 4000;
		}
		else
			return most.get(0) - 4000;
	}
	
	static int dis (int n, int[] arr) {
		int temp;
		for(int i=0; i<arr.length-1; i++) {
			for(int j =0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr[n-1] - arr[0];
	}
}
