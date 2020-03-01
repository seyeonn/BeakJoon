package step10;

import java.util.Scanner;

public class Bj_2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int m = scan.nextInt();
		int n = scan.nextInt();
		int sum=0;
		int min =n+1;
		for(int i=m; i<=n; i++) {
			int check=0;
			
			for(int j=1; j<=i; j++) {
				if(i%j == 0)
					check++;			
			}
			
			if(check == 2) {
				sum += i;
				if(min>i)
					min = i;
			}
		}
		if(sum != 0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else
			System.out.println(-1);
	}

}
