package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
	
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		
		number = divide(number, 2);
		for (int i = 3; i <= Math.sqrt(number); i += 2)
			number = divide(number, i);
		if (number != 1)
			sb.append(number);
		
		System.out.println(sb);
	}
	
	static int divide(int n, int d) {
		while (n % d == 0) {
			sb.append(d).append("\n");
			n /= d;
		}
		return n;
	}

}
