package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int length = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = -1000000;
		int min = 1000000;
		
		for (int i = 0; i < length; i++) {
			int number = Integer.parseInt(st.nextToken());
			max = Math.max(max, number);
			min = Math.min(min, number);
		}
		
		sb.append(min);
		sb.append(" ");
		sb.append(max);
		
		System.out.println(sb);
	}

}
