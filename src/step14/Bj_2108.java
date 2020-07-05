package step14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bj_2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int aver = 0;
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			aver += arr[i];		
		}

		Arrays.sort(arr);

		bw.write(Math.round((double)aver/n)+"\n");    //산술평균 출력
		bw.write(arr[n/2]+"\n");                      //중앙값 출력

		int[] num = new int[8001];                    //음수 범위의 배열은 없으므로 -4000 ~ 4000 을 0 ~ 8000 으로 바꿔서 계산
		int min = 0;
		ArrayList<Integer> most = new ArrayList<>();  //가장 많이 나타나는 값이 여러 개일 경우

		for(int i=0; i<arr.length; i++) 
			num[arr[i]+4000]++;

		for(int i=0; i<num.length; i++) {
			if(min <= num[i]) {
				if(min < num[i]) {
					min = num[i];
					most.clear();
					most.add(i);
				}
				else
					most.add(i);
			}
		}

		if(most.size() > 1) {                       //최빈값 출력
			Collections.sort(most);
			bw.write(most.get(1) - 4000 +"\n");
		}
		else
			bw.write(most.get(0) - 4000 +"\n");

		bw.write(arr[arr.length-1] - arr[0] + "\n");  //범위 출력

		br.close();
		bw.close();
	}

}

