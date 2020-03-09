package step13;

import java.util.Scanner;

public class Bj_2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int sum = 0;
		int temp;

		for(int i=0; i<n; i++) {
			sum = i;
			temp = i;

			while(temp > 0) {
				sum += temp%10;
				temp /= 10;
			}

			if(sum == n) {
				System.out.println(i);
				break;
			}	
		}
		if(sum!=n)
			System.out.println(0);


	}

}
