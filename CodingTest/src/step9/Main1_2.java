package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int l = Integer.parseInt(br.readLine());
		int[] sort = new int[l];
		
		for (int i = 0; i < l; i++)
			sort[i] = Integer.parseInt(br.readLine());
		
		for (int i = l - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (sort[j] > sort[j + 1]) {
					int tmp = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = tmp;
				}
			}
			
			sb.insert(0, "\n").insert(0, sort[i]);
		}
		
		sb.insert(0, "\n").insert(0, sort[0]);
		System.out.println(sb);
	}

}
