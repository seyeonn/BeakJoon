package step20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_9012 {

	static boolean VPS(String s) {
		int count = 0;
		for(char c : s.toCharArray()) {
			if(c=='(') ++count;
			else if(c==')') --count;
			if(count<0)  return false;
		}
		return count == 0;
	}

	public static void main(String[] args) throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		for(int i = 0; i<N; i++) {
			String s = reader.readLine();
			System.out.println(VPS(s) ? "YES" :"NO");
		}
	}

}
