package step19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj_2609 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int lcm = a*b;
        int gcd = 0;

        while(b != 0) {
        	gcd = b;
        	b = a%b;
        	a = gcd;
        }

        bw.write(String.valueOf(gcd) + "\n");
        bw.write(String.valueOf(lcm / gcd));

        br.close();
        bw.close();
	}

}
