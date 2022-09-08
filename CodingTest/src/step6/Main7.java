package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int rev1 = Integer.parseInt(st.nextToken());
		int rev2 = Integer.parseInt(st.nextToken());
		
		int num1 = rev1 / 100 + 10 * (rev1 / 10 % 10) + 100 * (rev1 % 10);
		int num2 = rev2 / 100 + 10 * (rev2 / 10 % 10) + 100 * (rev2 % 10);
		
		System.out.println(num1 > num2 ? num1 : num2);
	}

}
