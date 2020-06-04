package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_2579 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int num[] = new int[n];
		int score[] = new int[n];

		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		if(n==1)
			score[0] = num[0];
		else if(n==2)
			score[1] = num[0] + num[1];
		else {
			score[0] = num[0];
			score[1] = num[0] + num[1];
			score[2] = Math.max(num[0]+num[2], num[1]+num[2]);


			for(int j=3; j<n; j++) {
				score[j] = Math.max(num[j-1]+score[j-3]+ num[j] ,score[j-2]+ num[j]) ;
			}
		}
		bw.write(String.valueOf(score[n-1]));

		br.close();
		bw.close();
	}
}
