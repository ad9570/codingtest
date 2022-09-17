package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int fraction = Integer.parseInt(br.readLine());
		int sum = 0, cnt = 0;
		int numerator, denominator;
		
		while (sum < fraction)
			sum += ++cnt;
		
		if (cnt % 2 == 0) {
			denominator = sum - fraction + 1;
			numerator = cnt + 1 - denominator;
		} else {
			numerator = sum - fraction + 1;
			denominator = cnt + 1 - numerator;
		}
		
		sb.append(numerator).append("/").append(denominator);
		System.out.println(sb);
	}
	
}
