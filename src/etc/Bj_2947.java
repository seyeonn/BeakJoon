package etc;

import java.util.Scanner;

public class Bj_2947 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];

		for(int i=0; i<5; i++)
			arr[i] = scan.nextInt();

		int temp;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					for(int k=0; k<arr.length; k++)
						System.out.print(arr[k] + " ");
					System.out.println();

				}

			}

		}

	}

}
