package step19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bj_9375 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());

		for (int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			HashMap<String, Integer> clothes = new HashMap<>();
			int result = 1;

			for(int j=0; j<n; j++) {
				st = new StringTokenizer(br.readLine());
				String cloth = st.nextToken();
				String kind = st.nextToken();

				if(clothes.containsKey(kind))
					clothes.put(kind,  clothes.get(kind) + 1);
				else
					clothes.put(kind, 1);
			}

			for(int k : clothes.values())
				result *= k+1;

			bw.write(String.valueOf(--result + "\n"));
		}
		br.close();
		bw.close();

	}
}