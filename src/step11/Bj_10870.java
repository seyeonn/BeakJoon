package step11;

import java.util.Scanner;

public class Bj_10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		System.out.println(result(n));
	}

	static int result(int n) {
		if(n==0) return 0;
		else if(n==1) return 1;
		return result(n-1) + result(n-2);
	}
}
