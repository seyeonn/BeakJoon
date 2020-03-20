package etc;

import java.io.*;
import java.math.BigInteger;

public class Bj_10757 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arr = br.readLine().split(" ");
		
		bw.write(String.valueOf(new BigInteger(arr[0]).add(new BigInteger(arr[1]))));
		
		br.close();
		bw.close();
	}

}
