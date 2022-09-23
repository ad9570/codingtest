package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int prime = 0;
		
		primeTest:
		for (int i = 0; i < test; i++) {
			int number = Integer.parseInt(st.nextToken());
			
			if (number == 1 || (number % 2 == 0 && number != 2))
				continue;
			
			for (int j = 3; j <= Math.sqrt(number); j += 2) {
				if (number % j == 0)
					continue primeTest;
			}
			
			prime++;
		}
		
		System.out.println(prime);
	}

}
