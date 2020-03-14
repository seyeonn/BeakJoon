package step5;

import java.util.Scanner;

public class Bj_2523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for(int i=0; i<2*n-1; i++) {
			if(i<n) {
				for(int j=0; j<i+1; j++)
					System.out.print("*");
			}
			else {
				for(int k=i; k<2*n-1; k++)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
