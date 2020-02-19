package step6;

import java.util.Scanner;

public class Bj_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int c = scan.nextInt();

		int[] arr = new int[1000];

		int student;
		int total;
		int count;
		double average;
		double rate;
		
		for(int i=0; i<c; i++) {
			total = 0;
			count = 0;
			
			student = scan.nextInt();

			for(int j=0; j<student; j++) {
				arr[j] = scan.nextInt();
				total += arr[j];
			}

			average = total/student;

			for(int k=0; k<student; k++) {
				if(arr[k] > average)
					count++;
			}
			rate = 100.0*count/student;
			System.out.printf("%.3f",rate);
			System.out.println("%");
		}
		
		
	}

}
