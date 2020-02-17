package step3;

import java.util.Scanner;

public class Bj_2742 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		result(n);
	}

	static void result(int n) {
		if(n < 1)
			return;
		System.out.println(n);
		result(n-1);
	}
}
