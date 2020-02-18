package step6;

import java.util.Scanner;

public class Bj_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[10];

		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] mod = new int[10];
		for(int i=0; i<arr.length; i++) {
			mod[i] = arr[i]%42;
		}
		
		int count =0;
		for(int i=0; i<mod.length; i++) {
				if(mod[i] == mod[i+1])
					++count;
			}
		
		int number = 10-count;
		System.out.println(number);
	}

}
