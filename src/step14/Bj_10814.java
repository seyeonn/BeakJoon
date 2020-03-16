package step14;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj_10814 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String[][] members = new String[n][2];
		StringTokenizer str;

		for(int i=0; i<n; i++) {
			str = new StringTokenizer(br.readLine());
			members[i][0] = str.nextToken();
			members[i][1] = str.nextToken();
		}
		
		//Arrays.sort의 comparator 함수를 수정하는 방식
		Arrays.sort(members,(a,b) -> {
			return Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
		});
		
		for(int i=0; i<members.length; i++)
			bw.write(members[i][0] + " " + members[i][1] + "\n");
		
		br.close();
		bw.close();
	}

}
