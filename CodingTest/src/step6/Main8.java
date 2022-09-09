package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String dial = br.readLine();
		int dialTime = 0;
		
		for (int i = 0; i < dial.length(); i++) {
			char dialChar = dial.charAt(i);
			int dialNum;
			
			if (dialChar <= 'R') {
				dialNum = (dialChar - 'A') / 3 + 2;
			} else if ('S' <= dialChar && dialChar <= 'Y') {
				dialNum = (dialChar - 1 - 'A') / 3 + 2;
			} else {
				dialNum = (dialChar - 2 - 'A') / 3 + 2;
			}
			
			dialTime += dialNum + 1;
		}
		
		System.out.println(dialTime);
	}

}
