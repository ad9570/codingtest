package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		if (min < 3) {
			min = 3;
			sb.append(2).append("\n");
		}
		
		primeTest:
		for (int i = (min % 2 == 0 ? min + 1 : min) ; i <= max; i += 2) {
			for (int j = 3; j <= Math.sqrt(i); j += 2) {
				if (i % j == 0)
					continue primeTest;
			}
			
			sb.append(i).append("\n");
		}
		
		System.out.println(sb);
	}
	
}
