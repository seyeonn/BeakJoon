package step14;

import java.io.*;
import java.util.Arrays;

public class Bj_1181 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		String[] word = new String[n];
		
		for(int i=0; i<n; i++) 
			word[i] = br.readLine();
		
		Arrays.sort(word,(a,b) -> {       //길이 짧은순으로 정렬
			return Integer.compare(a.length(), b.length());
		});
		
		int len;
		int temp;
		int i,j;
		
		for(i=0; i<n; i++) {
			len = word[i].length();  
			
			for(j=i+1; j<n; j++) {
				temp = word[j].length();   //비교할 문자열 길이
				
				if(len != temp)    //길이가 같지 않을 경우 빠져나간다.
					break;         //같을 경우 반복
			}
			
			Arrays.sort(word,i,j); //문자열 길이가 같은 배열의 두 인덱스 범위 안에서 정렬
			i =j-1;   //i 값을 방금 정렬한 인덱스 -1 로 바꿔준다.
		}
		
		bw.write(word[0] + "\n");
		for(int k=1; k<n; k++) {
			if(word[k-1].equals(word[k]))   //같은 문자열이 존재한다면 건너뛰기
				continue;                   
			bw.write(word[k] + "\n");
		}
		
		br.close();
		bw.close();
	}

}
