package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sugar = Integer.parseInt(br.readLine());
			if (sugar == 4 || sugar == 7) {
				System.out.println(-1);
				return;
			}
		
		int pack = sugar / 5;
		switch (sugar % 5) {
			case 0:
				System.out.println(pack);
				break;
			case 1:
			case 3:
				System.out.println(pack + 1);
				break;
			default:
				System.out.println(pack + 2);
		}
	}
}
