package step10;

import java.util.Scanner;

public class Bj_3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int x[] = new int[3];
		int y[] = new int[3];

		for(int i=0; i<3; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}

		for(int i=0; i<2; i++) {
			for(int j=i+1; j<3; j++) {
				if(x[i] ==x[j]) {
					x[i] = 0;
					x[j] = 0;
				}
				if(y[i] == y[j]) {
					y[i]=0;
					y[j]=0;
				}
			}
		}
		int x1 = 0;
		int y1 = 0;

		for(int k=0; k<3; k++) {
			if(x[k] != 0)
				x1 = x[k];
			if(y[k] != 0)
				y1 = y[k];
		}
		System.out.println(x1+ " " + y1);
	}


}
