package step4;

import java.util.Scanner;

public class Bj_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int count = 1;

		int a = num%10;
		int b = num/10;

		int c = (b+a)%10;
		int r = (10*a)+ c;

		while(r!= num) {
			int temp = r;	
			a = temp%10;
			b = temp/10;

			c = (b+a)%10;
			r = (10*a)+ c;

			++count;
		}




		//		while(scan.hasNext()) {      초안 코드 -> 실행 결과 안 뜸. 
		//			int temp = num;	         오답 -> 반복문 돌릴때 마다 변수 temp에 초기 입력받았던 num 변수 값으로 초기화된다
		//			int a = temp%10;
		//			int b = temp/10;
		//			
		//			int c = (b+a)%10;
		//			int r = (10*a)+ c;
		//			
		//			if( r == num)
		//				break;
		//			else {
		//				temp = r;
		//				count++;
		//			}
		//				
		//		}

		System.out.println(count);
	}

}
