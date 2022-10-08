package prg_lv1;

public class Sum {

	public long solution(int a, int b) {
		long max = Math.max(a, b);
		long min = Math.min(a, b) - 1;
        return (max + min + 1) * (max - min) / 2;
    }
	
	public static void main(String[] args) {
		Sum s = new Sum();
		System.out.println(s.solution(7, 14));
	}
	
}
