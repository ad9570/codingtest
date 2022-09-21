package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int test = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < test; i++) {
			int level = Integer.parseInt(br.readLine());
			int num = Integer.parseInt(br.readLine());
			
			int line = level + num;
			int pascal = num - 1;
			
			int result = 1;
			
			for (int j = 1; j <= pascal; j++)
				result = result * line-- / j;
			
			sb.append(result).append("\n");
		}
		
		System.out.println(sb);
	}

}
