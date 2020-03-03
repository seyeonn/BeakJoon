package step10;

import java.util.Scanner;

public class Bj_9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		boolean[] check = new boolean[5082];
		//최대 입력값 10000을 넣어본 결과 더해지는 값 중 가장 큰 값이 5081로 나옴.
		
		check[0]=true;
		check[1]=true;

		for(int j=2; j<=5081; j++) {
			for(int k=2; j*k<=5081; k++) {
				check[j*k] = true;
			}
		}

		for(int i=0; i<t; i++) {
			int n = scan.nextInt();
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
