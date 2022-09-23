package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int min = Integer.parseInt(br.readLine());
		int max = Integer.parseInt(br.readLine());
		int sum = 0, first = 0;
		
		if (min < 3) {
			min = 3;
			if (max >= 2) {
				sum = 2;
                first = 2;
            }
		}
		
		primeTest:
		for (int i = (min % 2 == 0 ? min + 1 : min) ; i <= max; i += 2) {
			for (int j = 3; j <= Math.sqrt(i); j += 2) {
				if (i % j == 0)
					continue primeTest;
			}
			
			sum += i;
            first = first == 0 ? i : first;
		}
		
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(first);
		}
	}

}
