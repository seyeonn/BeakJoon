package etc;

import java.util.Scanner;

public class Bj_1475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String n = scan.next();
		int[] arr = new int[10];
		int set = 0;

		for(int i=0; i<n.length(); i++) {
			arr[n.charAt(i)-'0']++;
		}

		int sixNine = (arr[6]+arr[9])/2 + (arr[6]+arr[9])%2;

		for(int j=0; j<10; j++) {
			if(j==6 || j==9)
				continue;
			if(set<arr[j])
				set = arr[j];
		}

		if(set <sixNine)
			set = sixNine;

		System.out.println(set);


	}

}
