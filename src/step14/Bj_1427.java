package step14;

import java.io.*;

public class Bj_1427 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String n = br.readLine();
		
		char[] arr = new char[n.length()];
		
		for(int i=0; i<arr.length; i++)
			arr[i] = n.charAt(i);
		
		char temp;
		for(int i=0; i<arr.length-1; i++) {
			for(int j =0; j<arr.length-1-i; j++) {
				if(arr[j] < arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++)
			bw.write(arr[i]);
		
		br.close();
		bw.close();
		
		
	}

}
