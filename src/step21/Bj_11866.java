package step21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Bj_11866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken())-1;
		int index = k;
		LinkedList<Integer> q = new LinkedList<>();

		bw.write("<");
		for(int i=1; i<=n; i++)
			q.add(i);

		
		while(q.size() != 1) {
			bw.write(q.get(index).toString() + ", ");
			q.remove(index);
			index = (index+k)%q.size();
		}
		bw.write(q.pop().toString() + ">");

		br.close();
		bw.close();

	}

}
