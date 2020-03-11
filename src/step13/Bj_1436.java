package step13;

import java.util.Scanner;

public class Bj_1436 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int i = 666;
		String str ="";
		
		while(n!=0) {
			str = Integer.toString(i);
			if(str.contains("666")) {
				n--;
			}
			i++;
		}
		System.out.println(str);
	}

}
