package step13;

import java.util.Scanner;

public class Bj_7568 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] rank = new int[n];
		
		for(int i=0; i<n; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(x[i] < x[j] && y[i] < y[j])
					rank[i]++;
			}
		}
		
		for(int i=0; i<rank.length; i++)
			System.out.print(rank[i]+1 + " ");
	}

}
