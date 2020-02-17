package step3;

import java.util.Scanner;

public class Bj_2741 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		result(num);
	}

	static void result(int num) {
		if(num<=0) 
			return;
		result(num-1);
		System.out.println(num);
		
	}
}
