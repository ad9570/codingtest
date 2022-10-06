package prg_lv1;

import java.util.Arrays;

public class Reverse {

	public int[] solution(long n) {
		StringBuilder digit = new StringBuilder();
		return digit.append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
	
	public static void main(String[] args) {
		Reverse r = new Reverse();
		System.out.println(Arrays.toString(r.solution(1048576)));
	}
	
}
