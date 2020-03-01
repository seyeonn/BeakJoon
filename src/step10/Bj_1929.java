//   에라토스테네스의 체 - 소수 구하기
//   2~n까지 증가하는 i를 제외한 i의 배수를 하나하나 지워가면서 
//   n까지 도달했을 때 남은 수가 소수


package step10;

import java.util.Scanner;

public class Bj_1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int m = scan.nextInt();
		int n = scan.nextInt();

		boolean[] check = new boolean[n+1];
		check[0] =true;
		check[1] =true;

		for(int i=2; i<=n; i++) {
			for(int j=2; i*j<=n; j++) {
				check[i*j] = true;
			}
		}

		for(int i=m; i<=n; i++) {
			if(!check[i])
				System.out.println(i);
		}
	}

}
