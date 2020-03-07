package etc;

import java.util.Scanner;

public class Bj_1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();

		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

		int days =y;
		
		for(int i=0; i<x-1; i++) {
			days += month[i];
		}
		
		System.out.println(week[days%7]);
		scan.close();
	}

}
