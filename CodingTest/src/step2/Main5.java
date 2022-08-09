package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String time = bf.readLine();
		
		StringTokenizer st = new StringTokenizer(time);
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		min -= 45;
		
		if (min < 0) {
			min += 60;
			hour--;
			
			if (hour < 0) {
				hour += 24;
			}
		}
		
		System.out.println(hour + " " + min);
		bf.close();
	}
	
}
