import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(bf.readLine());
		int y = Integer.parseInt(bf.readLine());
		
		if (x * y > 0) {
			if (x > 0) {
				System.out.println(1);
			} else {
				System.out.println(3);
			}
		} else {
			if (x < 0) {
				System.out.println(2);
			} else {
				System.out.println(4);
			}
		}
	}

}
