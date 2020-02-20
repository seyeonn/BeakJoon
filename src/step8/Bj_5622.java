package step8;

import java.util.Scanner;

public class Bj_5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String words = scan.next();

		int sum = 0;
		char[] arr = new char[15];

		for(int i=0; i<words.length(); i++) {
			arr[i] = words.charAt(i);
			sum += dial(arr[i]) + 1;
		}
		System.out.println(sum);

	}

	static int dial(char c) {
		switch(c) {
		case 'A':
		case 'b':
		case 'c':
			return 2;
		case 'D':
		case 'E':
		case 'F':
			return 3;
		case 'G':
		case 'H':
		case 'I':
			return 4;
		case 'J':
		case 'K':
		case 'L':
			return 5;
		case 'M':
		case 'N':
		case 'O':
			return 6;
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			return 7;
		case 'T':
		case 'U':
		case 'V':
			return 8;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			return 9;
		default:
			return -1;


		}
	}

}
