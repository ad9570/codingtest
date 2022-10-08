package prg_lv1;

public class Collatz {
	
	public int solution(int num) {
		int t = 0;
		long n = (long)num;
        while (n != 1L && t++ < 500)
        	n = n % 2L == 0L ? n / 2L : n * 3L + 1L;
        return t == 501 ? -1 : t;
    }

	public static void main(String[] args) {
		Collatz c = new Collatz();
		System.out.println(c.solution(626331));
	}

}
