package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int fix = Integer.parseInt(st.nextToken());
		int var = Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(st.nextToken());
		
		int bep = 0;
		if (price != var)
			bep = fix / (price - var) + 1;
		System.out.println(bep > 0 ? bep : -1);
	}
	
}
