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




		//		while(scan.hasNext()) {      �ʾ� �ڵ� -> ���� ��� �� ��. 
		//			int temp = num;	         ���� -> �ݺ��� ������ ���� ���� temp�� �ʱ� �Է¹޾Ҵ� num ���� ������ �ʱ�ȭ�ȴ�
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
