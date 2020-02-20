package step8;

import java.util.Scanner;

public class Bj_2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		for(int i=0; i<t; i++) {
			int r = scan.nextInt();	
			String s = scan.next();
			
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<r; k++) {
					System.out.print(s.charAt(j));
				}
				System.out.println();
			}
		}

	}

}
