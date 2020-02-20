package step8;

import java.util.Scanner;

public class Bj_1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String words = scan.nextLine().trim();

		if(words.isEmpty())
			System.out.println(0);
		else
			System.out.println(words.split(" ").length);
	}

}
