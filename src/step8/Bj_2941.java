package step8;

import java.util.Scanner;

public class Bj_2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String words = scan.next();

		String[] cro = {"c=","c-","dz=","d-","lj","nj","s=","z="};

		for(int i=0; i<cro.length; i++) {
			words = words.replace(cro[i], "a");	//old ���ڿ��� new ���ڿ��� �ٲ۴�
		}
		System.out.println(words.length());
	}

}
