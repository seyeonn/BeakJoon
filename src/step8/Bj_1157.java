package step8;

import java.util.Scanner;

public class Bj_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String c = scan.next().toUpperCase();
		
		int[] arr = new int[26];
		
		int max =0;
		char result = '?';
		
		for(int i=0; i<c.length(); i++) {
			int al = c.charAt(i)-65;
			arr[al]++;
			
			if(max<arr[al]) {
				max = arr[al];
				result = c.charAt(i);
			}
			else if(max == arr[al]) {
				result = '?';
			}
		}
		System.out.println(result);
	}

}
