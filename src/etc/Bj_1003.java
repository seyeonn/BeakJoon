package etc;

import java.util.Scanner;

public class Bj_1003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		for(int i=0; i<t; i++) {
			int n = scan.nextInt();
			
			fibo(n);

		}
	}
	
	static int fibo(int n) {
		if(n == 0) {
			
			return 0;
		}
		else if(n == 1) {
			
			return 1;
		}
		else {
			return fibo(n-1) + fibo(n-2);
		}
		
	}

}
