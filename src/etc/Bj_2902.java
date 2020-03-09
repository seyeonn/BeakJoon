package etc;

import java.util.Scanner;

public class Bj_2902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String[] s = scan.nextLine().split("-");
		StringBuilder result = new StringBuilder("");

		for(String i : s) 
			result.append(i.charAt(0));

		System.out.println(result);


	}

}
