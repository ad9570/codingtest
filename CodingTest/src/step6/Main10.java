package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int groupWord = 0;
		
		Checker: for (int i = 0; i < cnt; i++) {
			String word = br.readLine();
			
			for (int j = 1; j < word.length(); j++) {
				char currentChar = word.charAt(j);
				char previousChar = word.charAt(j - 1);
				
				if (currentChar != previousChar) {
					if (word.indexOf(currentChar) != j)
						continue Checker;
				}
			}
			
			groupWord++;
		}
		
		System.out.println(groupWord);
	}

}
