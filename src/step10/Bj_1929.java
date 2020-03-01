package step10;

import java.util.Scanner;

public class Bj_1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int m = scan.nextInt();
		int n = scan.nextInt();

		for(int i=m; i<=n; i++) {
			int check=0;

			for(int j=1; j<=i; j++) {
				if(i%j == 0)
					check++;			
			}
			
			if(check == 2) {
				System.out.println(i);
			}
		}
	}

}
