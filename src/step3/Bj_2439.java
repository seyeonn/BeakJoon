package step3;

import java.util.Scanner;

public class Bj_2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
