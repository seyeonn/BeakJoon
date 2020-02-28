package etc;

import java.util.Scanner;

public class Bj_10808 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		int count =0;
		int[] arr = new int[26];

		for(int i=0; i<s.length(); i++) {
			arr[s.charAt(i)-'a']++;
		}
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j] +" ");
		}
	}

}
