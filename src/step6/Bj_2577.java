package step6;

import java.util.Scanner;

public class Bj_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		String str = Integer.toString(a*b*c);
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
			for(int j=0; j<str.length(); j++)
				if(i == str.charAt(j)-'0')
					arr[i]++;
			System.out.println(arr[i]);
		}
		
	}

}
