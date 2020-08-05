package step20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_9012_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
        	String str = br.readLine();
        	int count = 0;
        	int a = 0;
        	while(a < str.length()) {
        		if(str.charAt(a) == '(')
        			count++;
        		else {
        			if(count == 0) {
        				count = -1;
        				break;
        			}
        			count--;
        		}
        		a++;
        	}

        	if(count == 0) {
        		bw.write("YES");
                bw.newLine();
            } else {
                bw.write("NO");
                bw.newLine();
            }
        }

        br.close();
        bw.close();
	}

}
