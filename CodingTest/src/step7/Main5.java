package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int test = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int height = Integer.parseInt(st.nextToken());
			st.nextToken();
			int guest = Integer.parseInt(st.nextToken());
			
			int roomLevel = guest % height;
			int roomNum = guest / height + 1;
			sb.append(roomLevel != 0 ? roomLevel * 100 + roomNum : height * 100 + roomNum - 1);
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
