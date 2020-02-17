package step1;
import java.util.Scanner;

public class Bj_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int sum1 = num1*(num2%10);
		System.out.println(sum1);
		int sum2 = num1*((num2%100)/10);
		System.out.println(sum2);
		int sum3 = num1*(num2/100);
		System.out.println(sum3);
		int sum4 = sum1 + (sum2*10) + (sum3*100);
		System.out.println(sum4);

	}

}
