package prg_lv1;

public class Py {

	boolean solution(String s) {
		String str = s.toLowerCase();
        return (str + " ").split("p").length == (str + " ").split("y").length;
    }
	
	public static void main(String[] args) {
		Py p = new Py();
		System.out.println(p.solution("pewepewrdPytyYYyzPpk"));
	}
	
}
