import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String now = bf.readLine();
		int time = Integer.parseInt(bf.readLine());
		
		StringTokenizer st = new StringTokenizer(now);
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		
		min += time;
		while (min > 59) {
			min -= 60;
			hour += 1;
		}
		
		if (hour > 23) {
			hour -= 24;
		}
		
		System.out.println(hour + " " + min);
		bf.close();
	}

}
