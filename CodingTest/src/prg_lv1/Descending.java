package prg_lv1;

import java.util.Arrays;

public class Descending {

	public long solution(long n) {
        char[] arr = ("" + n).toCharArray();
        Arrays.sort(arr);

        StringBuilder num = new StringBuilder();
        num.append(arr).reverse();
        return Long.parseLong(num.toString());
    }
	
	public static void main(String[] args) {
		Descending d = new Descending();
		System.out.println(d.solution(453871));;
	}
	
}
