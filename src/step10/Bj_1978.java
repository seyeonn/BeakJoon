package step10;

import java.util.Scanner;

public class Bj_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int count=0;

		for(int i=0; i<n; i++) {
			int a = scan.nextInt();
			int check = 0;

			for(int j=1; j<=a; j++) {
				if(a%j == 0)
					check++;			
			}

			if(check ==2)
				count++;
		}
		System.out.println(count);
	}

}
