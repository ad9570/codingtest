package test1;

public class Twin {

	static public int solution(String s) {
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length() - 1; i++) {
			i = (i < 0 ? 0 : i);
			if (sb.charAt(i) == sb.charAt(i + 1)) {
				sb.delete(i, i + 2);
				i -= 2;
			}
		}
		
		return sb.length() == 0 ? 1 : 0;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("baabaa"));
		System.out.println(solution("cdcd"));
	}
	
}
