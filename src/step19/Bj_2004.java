package step19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj_2004 {
	static long five_count = 0;
    static long two_count = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());

		two_count = two_count(n);
		five_count = five_count(n);

		two_count -= two_count(n-m);
		two_count -= two_count(m);
		five_count -= five_count(n-m);
		five_count -= five_count(m);

        bw.write(String.valueOf(Math.min(two_count, five_count)));

        bw.close();
        br.close();
	}

	static long two_count(long n) {
		long count = 0;

		for(long i=2; i<=n; i*=2) {
			count += n/i;
		}
		return count;
	}

	static long five_count(long n) {
		long count = 0;

		for(long i=5; i<=n; i*=5) {
			count += n/i;
		}
		return count;
	}
}
