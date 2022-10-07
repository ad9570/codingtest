package prg_lv1;

public class ToNum {

	public int solution(String s) {
        return Integer.parseInt(s);
    }
	
	public static void main(String[] args) {
		ToNum t = new ToNum();
		System.out.println(t.solution("-4071"));;
	}
	
}
