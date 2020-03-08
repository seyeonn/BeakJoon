package step13;

import java.util.Scanner;

public class Bj_2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] card = new int[n];

		for(int i=0; i<card.length; i++) {
			card[i] = scan.nextInt();
		}

		int result = 0;
		int temp = 0;

		for(int i=0; i<n-2; i++) 
			for(int j=i+1; j<n-1; j++) 
				for(int k=j+1; k<n; k++) {
					result = card[i] + card[j] + card[k];
					if(result <= m) {
						if(temp <= result)
							temp = result;
					}
				}
		System.out.println(temp);
		scan.close();
	}

}
