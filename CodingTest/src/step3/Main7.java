package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int test = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append("Case #");
            sb.append(i);
            sb.append(": ");
            sb.append(a);
            sb.append(" + ");
            sb.append(b);
            sb.append(" = ");
            sb.append(a + b);
            sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
