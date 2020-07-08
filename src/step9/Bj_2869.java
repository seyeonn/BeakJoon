package step9;

import java.util.Scanner;

public class Bj_2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int v = scan.nextInt();

		int day;
		
		day = (v-b)/(a-b);    //정상 도착 시, 내려가는 일은 없으므로 정상에서 b만큼 빼준다.
		if((v-b)%(a-b) != 0)  //하루치 이하의 높이가 남을 경우, 하루를 추가해준다.
			day++;
		
		System.out.println(day);
	}

}
