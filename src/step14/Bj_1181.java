package step14;

import java.io.*;
import java.util.Arrays;

public class Bj_1181 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		String[] word = new String[n];
		
		for(int i=0; i<n; i++) 
			word[i] = br.readLine();
		
		Arrays.sort(word,(a,b) -> {
			return Integer.compare(a.length(), b.length());
		});
		
		int len;
		int temp;
		int i,j;
		
		for(i=0; i<n; i++) {
			len = word[i].length();
			
			for(j=i+1; j<n; j++) {
				temp = word[j].length();
				
				if(len != temp)
					break;
			}
			
			Arrays.sort(word,i,j);
			i =j-1;
		}
		
		bw.write(word[0] + "\n");
		for(int k=1; k<n; k++) {
			if(word[k-1].equals(word[k]))
				continue;
			bw.write(word[k] + "\n");
		}
		
		br.close();
		bw.close();
	}

}
