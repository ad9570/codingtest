package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt = 0, hex = 1;
		
		for (cnt = 1; hex < num; cnt++)
			hex += cnt * 6;
		
		System.out.println(cnt);
	}

}
