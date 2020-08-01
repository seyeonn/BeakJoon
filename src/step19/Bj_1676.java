package step19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_1676 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int input;
		int count = 0;

		for(int i=1; i<=n; i++) {
			input = i;

			while(input % 2== 0 || input %5 == 0) {
				if(input % 2 == 0)
					input /= 2;
				if(input%5 == 0) {
					input /= 5;
					count++;
				}
			}
		}

		bw.write(String.valueOf(count));

		br.close();
		bw.close();
	}

}
