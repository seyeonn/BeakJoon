package etc;

import java.util.Scanner;

public class Bj_5565 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[10];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			if(i>0)
				sum += arr[i];
		}
		int total = arr[0];

		System.out.println(total - sum);
	}

}
