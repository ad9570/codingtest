package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int test = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int student = Integer.parseInt(st.nextToken());
			int honor = 0, sum = 0;
			int[] score = new int[student];
			double avg;
			
			for (int j = 0; j < score.length; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
			}
			avg = sum / (double)student;
			
			for (int sc : score)
				honor = sc > avg ? honor + 1 : honor;
			
			sb.append(String.format("%.3f", honor * 100.0 / student));
			sb.append("%\n");
		}
		
		System.out.println(sb);
	}

}
