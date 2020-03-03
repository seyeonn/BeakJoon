package step10;

import java.util.Scanner;

public class Bj_9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		boolean[] check = new boolean[10000];
		check[0]=true;
		check[1]=true;

		for(int i=0; i<t; i++) {
			int n = scan.nextInt();

			for(int j=2; j<=n; j++) {
				for(int k=2; j*k<=n; k++) {
					check[j*k] = true;
				}
			}

			int x = n/2;
			int y = n/2;

			while(true) {
				if(!check[x] && !check[y])
					break;
				x--;
				y++;
			}
			System.out.println(x+" "+y);
		}
	}

}
