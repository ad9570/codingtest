package prg_lv1;

public class Cipher {

    public int solution(int n) {
        int answer = 0;
        
        while (n > 0) {
			answer += n % 10;
			n /= 10;
		}

        return answer;
    }
    
    public static void main(String[] args) {
		Cipher c = new Cipher();
		System.out.println(c.solution(273));
	}
	    
}
