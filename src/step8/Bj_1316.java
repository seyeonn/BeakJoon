package step8;

import java.io.IOException;
import java.util.Scanner;

public class Bj_1316 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			String s = scan.next();
			int arr[] = new int[26];
			for(int j=1; j<s.length(); j++) {
				if(s.charAt(j) != s.charAt(j-1)) {
					if(arr[s.charAt(j)-97] == 1) {
						++count;
						break;
					}
					arr[s.charAt(j-1)-97] = 1;
				}
			}
		}
		System.out.println(n-count);
		
	}

}
