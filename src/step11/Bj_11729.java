package step11;

import java.util.Scanner;

public class Bj_11729 {
	static int count = 0;
	static StringBuilder sb = new StringBuilder();

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
			sb.append(from + " " + to + "\n");
		}
		else {
			count++;
			hanoi(n-1,from,to,other);
			sb.append(from + " " + to + "\n");
			hanoi(n-1,other,from,to);
		}
		
	}
}
