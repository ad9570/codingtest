package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String word = br.readLine();
		
		for (char i = 'a'; i <= 'z'; i++)
			sb.append(word.indexOf(i)).append(" ");
		
		System.out.println(sb);
	}
	
}
