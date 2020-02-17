package step2;

import java.util.Scanner;

public class Bj_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();

		if(0<=h && h<=23) {
			if(m>=45 && m<=59)
				m -= 45;
			else if(m<45) {
				if(h==1) {
					m += 15;
					h =23;
				}
				else {
					m += 15;
					h -= 1;
				}
			}
		}
		System.out.println(h + " " + m);
	}

}
