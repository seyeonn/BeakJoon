package step10;

import java.util.Arrays;
import java.util.Scanner;

public class Bj_4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int z = scan.nextInt();
			
			if(x==0 && y==0 && z==0)
				break;
			int[] tri = {x,y,z};
			int max =0;
			Arrays.sort(tri);
			
			if(tri[0]*tri[0] + tri[1]*tri[1] == tri[2]*tri[2])
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}


}
