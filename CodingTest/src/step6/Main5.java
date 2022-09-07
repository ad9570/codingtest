package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().toUpperCase();
		int[] charCnt = new int[26];
		char result = 'A';
		int max = 0;
		
		for (int i = 0; i < input.length(); i++)
			charCnt[input.charAt(i) - 'A']++;
		
		for (int i = 0; i < charCnt.length; i++) {
			if (max == charCnt[i]) {
				result = '?';
			} else if (max < charCnt[i]) {
				max = charCnt[i];
				result = (char)(i + 'A');
			}
		}
		
		System.out.println(result);
	}

}
