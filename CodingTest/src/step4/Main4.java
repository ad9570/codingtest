package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int exam = Integer.parseInt(br.readLine());
		int[] score = new int[exam];
		float[] fake = new float[exam];
		float max = 0.0f, sum = 0.0f;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < exam; i++) {
			score[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, score[i]);
		}
		
		for (int i = 0; i < exam; i++) {
			fake[i] = score[i] / max * 100;
			sum += fake[i];
		}
		
		System.out.println(sum / exam);
	}

}
