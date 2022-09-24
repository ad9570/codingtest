package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4 {
	
	static boolean[] notPrime;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		notPrime = new boolean[max + 1];
		setPrime(max);
		
		for (int i = (min == 1 ? 2 : min); i <= max; i++) {
			if (!notPrime[i])
				sb.append(i).append("\n");
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
