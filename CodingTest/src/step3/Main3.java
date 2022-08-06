package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int num = Integer.parseInt(bf.readLine());
		
		for (int i = 1; i <= num ; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		bf.close();
	}

}
