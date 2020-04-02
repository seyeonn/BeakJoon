package step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_9663 {
	static int n;
	static int[] chess;
	static int total = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
		chess = new int[n];

		nQueen(0);
		bw.write(String.valueOf(total));

		br.close();
		bw.close();
	}

	static void nQueen(int level) {
		if(level == n)
			total++;
		else {
			for(int i=0; i<n; i++) {
				chess[level] = i;
				if(isPossible(level))
					nQueen(level+1);
			}
		}
	}

	static boolean isPossible(int level) {
		for(int i=0; i<level; i++)
			if(chess[i] == chess[level] || (Math.abs(level-i) == Math.abs(chess[level] - chess[i])))
				return false;
		return true;
	}
}
