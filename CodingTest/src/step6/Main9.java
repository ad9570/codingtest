package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cr = br.readLine();
		int cnt = 0;
		
		for (int i = 1; i < cr.length(); i++) {
			char currentChar = cr.charAt(i);
			char previousChar = cr.charAt(i - 1);
			
			if (currentChar == '=') {
				cnt++;
				if (i >= 2)
					cnt = (previousChar == 'z' && cr.charAt(i - 2) == 'd') ? cnt + 1 : cnt;
			} else if (currentChar == '-') {
				cnt++;
			} else if (currentChar == 'j' && (previousChar == 'l' || previousChar == 'n')) {
				cnt++;
			}
		}
		
		System.out.println(cr.length() - cnt);
	}

}
