package prg_lv1;

public class Harshad {

	static public int digitSum(int n) {
        int answer = 0;
        
        while (n > 0) {
			answer += n % 10;
			n /= 10;
		}

        return answer;
    }
	
	public boolean solution(int x) {
        return x % digitSum(x) == 0;
    }
	
	public static void main(String[] args) {
		Harshad h = new Harshad();
		System.out.println(h.solution(12));
	}
	
}
