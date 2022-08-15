package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int test = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < test; i++) {
			String quiz = br.readLine();
			int sequence = 0;
			int score = 0;
			
			for (int j = 0; j < quiz.length(); j++) {
				if (quiz.charAt(j) == 'O')
					score += ++sequence;
				else
					sequence = 0;
			}
			
			sb.append(score).append("\n");
		}
		
		System.out.println(sb);
	}

}
