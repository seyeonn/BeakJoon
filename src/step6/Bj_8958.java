package step6;

import java.util.Scanner;

public class Bj_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] score = new int[n];
		
		for(int i=0; i<n; i++) {
			score[i] = 0;
			String str = scan.next();
			
			int temp =1;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == 'O') {
					score[i] += temp;
					temp++;
				}
				else
					temp=1;
			}
		}
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}

	}
}
