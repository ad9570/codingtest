package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int l = Integer.parseInt(br.readLine());
		int[] sort = new int[l];
		
		for (int i = 0; i < l; i++) {
			sort[i] = Integer.parseInt(br.readLine());
			
			for (int j = i; j > 0; j--) {
				if (sort[j] < sort[j - 1]) {
					int tmp = sort[j];
					sort[j] = sort[j - 1];
					sort[j - 1] = tmp;
				}
			}
		}
		
		for (int i = 0; i < l; i++)
			sb.append(sort[i]).append("\n");
		
		System.out.println(sb);
	}

}
