package step14;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Bj_2751 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> num = new ArrayList<>();

		for(int i=0; i<n; i++)
			num.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(num);
		
		for(int i=0; i<num.size(); i++) 
			bw.write(num.get(i) + "\n");
		
		br.close();
		bw.close();
		
	}

}
