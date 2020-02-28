package step7;

public class Bj_4673 {
	private static boolean[] check = new boolean[10000];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		
		for(i=1; i<10000 ; i++) {
			d(i);
		}
		for(i=1; i<10000; i++) {
			if(!check[i])
				System.out.println(i);
		}

	}

	static int d(int n) {
		int sum =0;

		if(n<10) {
			sum = n*2;
			check[sum] = true;
		}
		else if(10<=n && n<100) {
			int[] num = new int[2];
			num[0] = n/10;
			num[1] = n%10;
			sum = num[0] + num[1] + n;		
			check[sum] = true;
		}
		else if(100<=n && n<1000) {
			int[] num = new int[3];
			num[0] = n/100;
			num[1] = (n%100)/10;
			num[2] = n%10;
			sum = num[0] + num[1] +num[2] +n;
			check[sum] = true;
		}
		else if(1000<=n && n<10000) {
			int[] num = new int[4];
			num[0] = n/1000;
			num[1] = (n%1000)/100;
			num[2] = (n%100)/10;
			num[3] = n%10;
			sum = num[0] + num[1] + num[2] + num[3] + n;

			if(sum >= 10000)
				return 0;
			check[sum] = true;	
		}
		else
			return 0;
		return d(sum);
	}
}
