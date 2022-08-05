import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}

}
