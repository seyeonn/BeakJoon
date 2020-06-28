package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_1904 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int tiles[] = new int[1000001];
		tiles[0] = 1;
		tiles[1] = 2;
		tiles[2] = 3;

		for(int i=3; i<=n; i++) {
			tiles[i] = tiles[i-2] + tiles[i-1];
			tiles[i] %= 15746;
		}

		bw.write(String.valueOf(tiles[n-1]));

		br.close();
		bw.close();
	}

}
