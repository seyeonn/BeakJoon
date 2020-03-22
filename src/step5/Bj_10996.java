package step5;

import java.util.Scanner;

public class Bj_10996 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for(int i=1; i<=n*2; i++) {
			if(i%2 == 1) {
				for(int j=1; j<=n; j++) {
					if(j%2 == 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}				
			}
			else {
				for(int j=1; j<=n; j++) {
					if(j%2 == 1)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
