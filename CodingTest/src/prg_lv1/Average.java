package prg_lv1;

import java.util.Arrays;

public class Average {

	public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
	
	public static void main(String[] args) {
		Average a = new Average();
		int[] arr = {4, 7, 11};
		System.out.println(a.solution(arr));;
	}
	
}
