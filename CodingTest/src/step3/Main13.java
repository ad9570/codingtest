package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int ten = input / 10;
		int one = input % 10;
		
		int cycle = 0, number = -1;
		
		while (number != input) {
			number = 10 * one + (ten + one) % 10;
			
			ten = number / 10;
			one = number % 10;
			cycle++;
		}
		
		System.out.println(cycle);
	}

}
