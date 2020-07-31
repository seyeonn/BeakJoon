package step19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj_11051 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] tri = new int[n+1][n+1];

        for(int i=0; i<tri.length; i++) {
        	for(int j=0; j<=i; j++) {
        		if(j==0 || i==j)
        			tri[i][j] = 1;
        		else
        			tri[i][j] = (tri[i-1][j-1] + tri[i-1][j])%10007;
        	}
        }
        bw.write(String.valueOf(tri[n][k]));
        bw.close();
        br.close();
	}

}
