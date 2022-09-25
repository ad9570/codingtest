package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {
	
	static boolean[] notPrime;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int max = 2 * 123456;
		notPrime = new boolean[max + 1];
		setPrime(max);
		int num;
		
		while ((num = Integer.parseInt(br.readLine())) != 0) {
			int cnt = 0;
			
			for (int i = num + 1; i <= 2 * num; i++) {
				if (!notPrime[i])
					cnt++;
			}
			
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb);
	}
	
	static void setPrime(int max) {
		for (int i = 2; i <= Math.sqrt(max); i++) {
			if (notPrime[i])
				continue;
			for (int j = i * i; j <= max; j += i)
				notPrime[j] = true;
		}
	}

}
