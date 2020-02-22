package step8;

import java.util.Scanner;

public class Bj_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		
		for(char i = 'a'; i<='z'; i++) {
			System.out.print(s.indexOf(i)+" ");
		}
		
	}

}
