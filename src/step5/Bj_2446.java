package step5;

import java.util.Scanner;

public class Bj_2446 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		

		for(int i=0; i<2*n-1; i++) {
			int temp = 0;
			if(i<n) {
				if(temp <=i)
					for(int k=0; k<i; k++)
						System.out.print(" ");
				for(int j=2*n-1; j>i*2; j--) {
					System.out.print("*");
					temp++;
				}
			}
			else {
				for(int j=i; j<2*n-2; j++) {
					System.out.print(" ");
					temp ++;
				}
				if(temp<2*n-1)
					for(int k=temp; k<2*n-1-temp; k++)
						System.out.print("*");
				
			}
			System.out.println();
			
		}


	}

}
