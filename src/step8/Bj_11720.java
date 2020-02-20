package step8;

import java.util.Scanner;

public class Bj_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int total =0;
		
		for(int i=0; i<n; i++) {
			char c = scan.next().charAt(i);
			total += c;
		}
		
		System.out.println(total);
	}

}
