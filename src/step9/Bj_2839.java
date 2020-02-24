package step9;

import java.util.Scanner;

public class Bj_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		if(n%5 == 0) {
			System.out.println(n/5);
			return;
		}
		else {
			int a = n/5;

			for(int i=a; i>0; i--) {
				int t = n-i*5;
				if(t%3 == 0) {
					System.out.println(t/3+i);
					return;
				}
			}
		}

		if(n%3 == 0) {
			System.out.println(n/3);
		}
		else
			System.out.println(-1);
		return;
	}

}
