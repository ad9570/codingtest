package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer lengthMax = new StringTokenizer(br.readLine());
		int length = Integer.parseInt(lengthMax.nextToken());
		int max = Integer.parseInt(lengthMax.nextToken());
		
		StringTokenizer numberArray = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < length; i++) {
			int number = Integer.parseInt(numberArray.nextToken());
			if (number < max) {
				sb.append(number);
				sb.append(" ");
			}
		}
		
		System.out.println(sb);
	}

}
