package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			int input = Integer.parseInt(br.readLine()) % 42;
			set.add(input);
		}
		
		System.out.println(set.size());
	}

}
