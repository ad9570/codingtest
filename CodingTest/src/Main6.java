import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(bf.readLine());
		
		if (score / 10 >= 9) {
			System.out.println("A");
		} else if (score / 10 == 8) {
			System.out.println("B");
		} else if (score / 10 == 7) {
			System.out.println("C");
		} else if (score / 10 == 6) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
	
}
