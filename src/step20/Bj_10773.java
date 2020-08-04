package step20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_10773 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[100000];
        int top =-1;
        int num;
        int sum = 0;

        for(int i=0; i<n; i++) {
        	num = Integer.parseInt(br.readLine());
        	if(num == 0)
        		top--;
        	else {
        		top++;
        		nums[top] = num;
        	}
        }

        for(int i=0; i<=top; i++) {
        	sum += nums[i];
        }

        bw.write(String.valueOf(sum));
        br.close();
        bw.close();
	}

}
