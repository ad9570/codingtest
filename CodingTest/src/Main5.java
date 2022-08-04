import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		
		String s;
		try {
			s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if (a > b) {
				System.out.println(">");
			} else if (a < b) {
				System.out.println("<");
			} else {
				System.out.println("==");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
