package prg_lv1;

public class Remainder {

	public int solution(int n) {
		if (n % 2 != 0) {
			return 2;
		} else {
			for (int i = 3; ; i += 2)
				if (n % i == 1) return i;
		}
    }
	
	public static void main(String[] args) {
		Remainder r = new Remainder();
		System.out.println(r.solution(122));
	}
}
