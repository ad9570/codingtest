package test1;

public class Palindrome {

	static public int solution(String s) {
		int length = 1;
		for (int i = 1; i < s.length() - 1; i++) {
			int compare = 1, left = i - 1, right = i + 1;
			
			while (left >= 0 && right < s.length()) {
				if (s.charAt(left) == s.charAt(right)) {
					compare += 2;
					left--;
					right++;
				} else {
					break;
				}
			}
			
			length = Math.max(compare, length);
			if (length == s.length()) break;
		}
		
		return length;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("abcdcba"));
		System.out.println(solution("abacde"));
	}
	
}
