package step8;

import java.util.Scanner;

public class Bj_2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String words = scan.next();

		String[] cro = {"c=","c-","dz=","d-","lj","nj","s=","z="};

		for(int i=0; i<cro.length; i++) {
			words = words.replace(cro[i], "a");	//old 문자열을 new 문자열로 바꾼다
		}
		System.out.println(words.length());
	}

}
