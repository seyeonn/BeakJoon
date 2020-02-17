package step3;

import java.util.Scanner;

public class Bj_8393 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		System.out.println(total(n));
	
	}

	static int total(int n) {
		if(n==1) return 1;
		return total(n-1)+ n;
	}
}
