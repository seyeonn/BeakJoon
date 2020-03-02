package step10;

import java.util.Scanner;

public class Bj_4948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		while(true) {
			int n = scan.nextInt();
			int count=0;
			if(n == 0)
				break;
			else {
				for(int j=n; j<=2*n; j++) {
					int check =0;

					for(int k=1; k<=j; k++) {
						if(j%k == 0)
							check++;
					}

					if(check == 2)
						count++;	
				}
				System.out.println(count);
			}
		}
	}

}
