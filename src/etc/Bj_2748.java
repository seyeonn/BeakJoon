//n이 90일 때는 int형 값을 넘어가므로 long을 써야한다.

package etc;

import java.util.Scanner;

public class Bj_2748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		long[] fibo = new long[n+1];
		fibo[0] = 0;
		fibo[1] = 1;

		for(int i=2; i<=n; i++) {
			fibo[i] = fibo[i-1] +fibo[i-2];
		}
		System.out.println(fibo[n]);
	}

}
