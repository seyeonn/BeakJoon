package step6;

import java.util.Scanner;

public class Bj_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		int[] arr = new int[n];

		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
		}
		
		System.out.println(min + " " + max);

	}

}
