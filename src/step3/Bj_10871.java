package step3;

import java.util.Scanner;

public class Bj_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = scan.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		int min = x;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min)
				System.out.print(arr[i] + " ");
				
		}
		
//		for(int i=0; i<n; i++) {
//			int a = scan.nextInt();
//			
//			if(a<x)
//				System.out.print(a+" ");
//		}
	}

}
