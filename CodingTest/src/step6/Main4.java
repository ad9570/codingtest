package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int rep = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			for (int j = 0; j < str.length(); j++)
				sb.append(str.substring(j, j + 1).repeat(rep));
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
