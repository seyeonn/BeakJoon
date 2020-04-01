package step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj_14888 {
	static int n;
	static int[] num;
	static int[] oper = new int[4];
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
		num = new int[n+1];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i=0; i<n; i++)
			num[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++)
			oper[i] = Integer.parseInt(st.nextToken());

		total(0, num[0], 0);
		bw.write(String.valueOf(max) + "\n");
		bw.write(String.valueOf(min));

		br.close();
		bw.close();
	}

	static void total(int number, int result, int j) {
		if(number == n-1) {
			if(max < result)
				max = result;
			if(min > result)
				min = result;
		}
		for(int i=0; i<4; i++) {
			if(oper[i] > 0) {
				if(i == 0) {
					oper[i]--;
					total(number+1, result + num[j+1], j+1);
					oper[i]++;
				}
				else if(i == 1) {
					oper[i]--;
					total(number+1, result - num[j+1], j+1);
					oper[i]++;
				}
				else if(i == 2) {
					oper[i]--;
					total(number+1, result * num[j+1], j+1);
					oper[i]++;
				}
				else if(i == 3) {
					oper[i]--;
					total(number+1, result / num[j+1], j+1);
					oper[i]++;
				}
			}

		}
	}
}
