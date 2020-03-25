package etc;

import java.util.Scanner;

public class Bj_10797 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int day = scan.nextInt();
		int count = 0;

		int[] car = new int[5];

		for(int i=0; i<5; i++) {
			car[i] = scan.nextInt();
			if(car[i] == day)
				count++;
		}
		System.out.println(count);

	}

}
