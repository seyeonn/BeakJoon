package step15;

import java.util.Scanner;

public class Bj_15651 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int[] arr = new int[m];


		dfs(arr,0,n);
	}

	static void dfs(int[] arr, int d, int n) {
		if(d == arr.length) {
			for(int i=0; i<arr.length; i++)
				System.out.print(arr[i] + " ");
			System.out.println();
		}
		else {
			for(int i=1; i<=n; i++) {
					arr[d] = i;
					dfs(arr,d+1,n);
			}
		}
	}

}
