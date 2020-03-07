package step11;

import java.util.Arrays;
import java.util.Scanner;

public class Bj_2447 {
	public static char[][] star;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		star = new char[n][n];

		for(int i=0; i<n; i++)
			Arrays.fill(star[i], ' ');

		result(0,0,n);

		for(int i=0; i<n; i++)
			System.out.println(star[i]);
	}

	static void result(int x, int y, int n) {
		if(n==1) {
			star[x][y] ='*';
			return;
		}
		
		int m = n/3;

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i==1 && j==1)
					continue;
				result(x + m * i, y + m * j, m);
			}
		}
	}
}
