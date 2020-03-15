package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Bj_10953 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		int[] num = new int[2];
		
		for(int i=0; i<t; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			for(int j=0; j<2; j++)
				num[j] = Integer.parseInt(str.nextToken(","));
			
			int sum = 0;
			
			for(int k =0; k<num.length; k++)
				sum += num[k];
			
			bw.write(String.valueOf(sum)+"\n");
		}
		br.close();
		bw.close();
	}

}
