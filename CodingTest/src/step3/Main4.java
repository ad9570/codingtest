package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total = Integer.parseInt(br.readLine());
		int category = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < category; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int price = Integer.parseInt(st.nextToken());
			int count = Integer.parseInt(st.nextToken());
			total -= price * count;
		}
		
		bw.write(total == 0 ? "Yes" : "No");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
