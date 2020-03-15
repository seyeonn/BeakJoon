package step14;

import java.util.Scanner;

public class Bj_10989 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();	
		}

		int temp;
		for(int i=0; i<arr.length-1; i++) {
			for(int j =0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}

}
