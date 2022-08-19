package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main3 main = new Main3();
		int num = Integer.parseInt(br.readLine());
		int cnt = num < 100 ? num : 99;
		
		for (int i = 111; i <= num; i++)
			cnt += main.arithmetic(i);
		
		System.out.println(cnt);
	}
	
	public int arithmetic(int n) {
		while (n >= 100) {
			int a = n % 10;
			int b = (n / 10) % 10;
			int c = (n / 100) % 10;
			
			if (a - b != b - c)
				return 0;
			n /= 10;
		}
		
		return 1;
	}

}
