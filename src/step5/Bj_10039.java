package step5;

import java.util.Scanner;

public class Bj_10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] score = new int[5];
		for(int i=0; i<score.length; i++)
			score[i] = scan.nextInt();
		
		int sum =0;
		
		for(int i=0; i<score.length; i++) {
			if(score[i] < 40)
				score[i] = 40;
			sum += score[i];
		}
		
		System.out.println(sum/5);
	}

}
