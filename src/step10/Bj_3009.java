package step10;

import java.util.Scanner;

public class Bj_3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[6];

		for(int i=0; i<arr.length; i++)
			arr[i] = scan.nextInt();

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] ==arr[j]) {
					arr[i] = 0;
					arr[j] = 0;
				}
			}
		}
		
		for(int k=0; k<arr.length; k++) {
			if(arr[k] != 0)
				System.out.print(arr[k]+" ");
		}
	}
	

}
