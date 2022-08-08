package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int line = Integer.parseInt(br.readLine());
		
		for (int i = line; i > 0; i--) {
			sb.append(" ".repeat(i - 1));
			sb.append("*".repeat(line - (i - 1)));
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
