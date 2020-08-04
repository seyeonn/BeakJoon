package step19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_11653 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int i = 2;

        while(n != 1) {
        	if(n%i == 0) {
        		n /= i;
        		bw.write(String.valueOf(i) + "\n");
        	}
        	else
        		i++;
        }

        br.close();
        bw.close();
	}

}
