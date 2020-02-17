package step2;

import java.util.Scanner;

public class Bj_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();

		int mm = m-45;
		
		if(mm < 0) {
			mm += 60;
			--h;
			if(h < 0)
				h += 24;
		}
		
		System.out.println(h + " " + mm);
	}

}
