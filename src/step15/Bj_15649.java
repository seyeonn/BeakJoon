package step15;

import java.util.Scanner;

public class Bj_15649 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int[] arr = new int[m];

		dfs(arr,0,n);

	}

	static void dfs(int[] arr, int d, int n) {
		if(d == arr.length) {                   //0부터 m까지 반복으면 처리 완성
			for(int i=0; i<arr.length; i++)     //현재 결과 배열 출력
				System.out.print(arr[i]+ " ");
			System.out.println();
		}
		else {
			for(int i=1; i<=n; i++) {      //수의 범위는 1~ n까지
				if(!visited(arr,i,d)) {    //방문하지 않았을 경우
					arr[d] = i;            //현재 반복횟수에 해당하는 배열에 i값 삽입
					dfs(arr,d+1,n);        //반복횟수 증가
				}
			}
		}
	}

	static boolean visited(int[] arr, int find, int k) {
		for(int i=0; i<k; i++)
			if(arr[i] == find)
				return true;     //방문했을 경우
		return false;            //방문 하지 않았을 경우
	}
}
