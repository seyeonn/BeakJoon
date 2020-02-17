package step3;

import java.util.Scanner;

public class Bj_10950 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		int total=0;

		for(int i=0; i<t; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			total = a+b;
			System.out.println(total);
			}

	}
}
