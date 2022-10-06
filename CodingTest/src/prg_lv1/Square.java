package prg_lv1;

public class Square {

	public long solution(long n) {
        long root = (long)Math.sqrt(n);
        return (n == root * root) ? (long)Math.pow(root + 1, 2) : -1L;
    }
	
	public static void main(String[] args) {
		Square s = new Square();
		System.out.println(s.solution(16));
	}
	
}
