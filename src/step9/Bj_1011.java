/*
 양 쪽 거리에서 1씩 증가를 시켜본다.
 예를 들어, 거리가 16일때 총 7회 1 + 2 + 3 + 4 + 3 + 2 +1
 가운데 가장 큰수를 기준으로 양 쪽이 대칭을 이룰 때 최대 이동횟수를 찍는다.
 거리 = y-x 이므로 1, 1, 2, 2, 3, 3, 4 ~~~
 각 이동이 될때마다 카운트를 센다.
 각 이동이 진행될때마다 거리에서 각 단계를 빼준다.
 거리가 0이 되거나 0보다 작은 경우의 카운트가 이동횟수가 된다.
   (출처: @audtjr9514)
 */

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
