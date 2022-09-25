package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6 {
	
	static boolean[] notPrime;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int test = Integer.parseInt(br.readLine());
		notPrime = new boolean[10001];
		setPrime(10000);
		
		for (int i = 0; i < test; i++) {
			int num = Integer.parseInt(br.readLine()) / 2;
			
			for (int j = num, k = num; j > 1; j--, k++)
				if (!notPrime[j] && !notPrime[k]) {
					sb.append(j).append(" ");
					sb.append(k).append("\n");
					break;
				}
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
