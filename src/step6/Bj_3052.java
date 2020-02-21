package step6;

import java.util.Arrays;
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

		Arrays.sort(mod);

		int count = 1;
		for(int i=0; i<mod.length-1; i++) {
				if(mod[i] != mod[i+1])
					count++;
			}

		System.out.println(count);


	}

}
