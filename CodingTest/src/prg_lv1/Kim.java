package prg_lv1;

public class Kim {

	public String solution(String[] seoul) {
		for (int i = 0; i < seoul.length; i++)
			if (seoul[i].equals("Kim"))
				return "김서방은 " + i + "에 있다";
		return null;
    }
	
	public static void main(String[] args) {
		Kim k = new Kim();
		String[] s = {"Lee", "Park", "Kim", "Choi", "Kwon"};
		System.out.println(k.solution(s));;
	}
	
}
