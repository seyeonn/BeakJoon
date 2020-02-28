package step9;

import java.util.Scanner;

public class Bj_1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		for(int i=0; i<t; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			int distance = y-x;
			int count =0;
			int move = 0;
			
			while(true) {
				move++;
				distance -= move;
				count++;
				
				if(distance<=0)
					break;
				else {
					distance -= move;
					count++;
					if(distance<=0)
						break;
				}
			}
			System.out.println(count);
		}
	}

}
