package step8;

import java.util.Scanner;

public class Bj_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int total =0;

		String str = scan.next();
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			total += arr[i]-'0';
		}

		System.out.println(total);
	}

}
