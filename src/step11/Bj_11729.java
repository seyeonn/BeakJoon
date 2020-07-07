/* 원반이 n개 일때
1번 기둥에 있는 n-1개 원반을 2번 기둥에 옮긴다. -1
1번 기둥에 가장 큰 원반을 3번 기둥으로 옮긴다. -2
2번 기둥에 있는 n-1개 원반을 3번 기둥으로 옮긴다. -3
  (출처: @nsap19)
 */

package step11;

import java.util.Scanner;

public class Bj_11729 {
	static int count = 0;
	static StringBuilder sb = new StringBuilder();  //문자열 결합처리가 많은 경우 StringBuilder 클래스 이용

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		hanoi(n,1,2,3);
		
		System.out.println(count);
		System.out.println(sb);
	}
	
	public static void hanoi(int n, int from, int other, int to) {
		if(n == 1) {
			count++;
			sb.append(from + " " + to + "\n");    //문자열 추가하기
		}
		else {
			count++;
			hanoi(n-1,from,to,other);
			sb.append(from + " " + to + "\n");
			hanoi(n-1,other,from,to);
		}
		
	}
}
