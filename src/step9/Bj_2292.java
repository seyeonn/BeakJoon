package step9;

import java.util.Scanner;

public class Bj_2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		int result = 1;
		int room =1;
		int count =1;
		
		for(int i=0; ; i++) {
			room += i*6;
			if(room >= n) {
				count += i;
				break;
			}
		}
		System.out.println(count);
	}

}
