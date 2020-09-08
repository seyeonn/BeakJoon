package step21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_2164 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] dequeue = new int[n*2];
		int front = 0;
		int rear = n-1;
		
		for(int i=0; i<n; i++) {
			dequeue[i] = i+1;
		}
		
		while(true) {
			if(n == 1)
				break;
			front++;
			if(front == rear)
				break;
			dequeue[++rear] = dequeue[front];
			front++;
		}
		
		bw.write(String.valueOf(dequeue[front]));
		
		br.close();
		bw.close();
	}

}
