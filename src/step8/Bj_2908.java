package step8;

import java.util.Scanner;

public class Bj_2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = scan.next();

		String temp="";
		for(int i=a.length()-1; i>=0; i-- ) {
			temp += a.charAt(i);
		}
		a= temp;
		
		temp="";
		for(int i=b.length()-1; i>=0; i-- ) {
			temp += b.charAt(i);
		}
		b= temp;
		
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		
		if(num1>num2)
			System.out.println(num1);
		else
			System.out.println(num2);
		
	}

}
