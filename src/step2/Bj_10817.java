package step2;

import java.util.Scanner;

public class Bj_10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if(b<=a&&a<=c || c<=a&&a<=b)
			System.out.println(a);
		else if(a<=b&&b<=c || c<=b&&b<=a)
			System.out.println(b);
		else
			System.out.println(c);
	}

}
