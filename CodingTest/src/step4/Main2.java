package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int max = 1, no = 1;
		
		for (int i = 1; i <= 9; i++) {
			int input = Integer.parseInt(br.readLine());
			
			if (input > max) {
				max = input;
				no = i;
			}
		}
		
		sb.append(max).append("\n").append(no);
		System.out.println(sb);
	}

}
