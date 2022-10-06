package prg_lv1;

public class Divisor {

	public int solution(int n) {
		int answer = 0;
		
		int i;
		for (i = 1; i <= Math.sqrt(n); i++)
			answer += (n % i == 0) ? (i + n / i) : 0;
		answer -= (--i * i == n) ? i : 0;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Divisor d = new Divisor();
		System.out.println(d.solution(60));;
	}
	
}
