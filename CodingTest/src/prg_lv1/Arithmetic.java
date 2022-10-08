package prg_lv1;

import java.util.Arrays;

public class Arithmetic {

	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = (long)x;
        for (int i = 0; i < n; i++)
        	answer[i] = num * (i + 1);
        return answer;
    }
	
	public static void main(String[] args) {
		Arithmetic a = new Arithmetic();
		System.out.println(Arrays.toString(a.solution(10000000, 1000)));
	}
}
