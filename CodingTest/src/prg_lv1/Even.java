package prg_lv1;

public class Even {
	
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
	
	public static void main(String[] args) {
		Even e = new Even();
		System.out.println(e.solution(7));
	}

}
