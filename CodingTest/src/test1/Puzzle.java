package test1;

import java.util.Arrays;

public class Puzzle {

	static public int solution(String[] strs, String t) {
		int cnt = 0;
		StringBuilder sb = new StringBuilder(t);
		System.out.println(sb);
		Arrays.sort(strs, (String s1, String s2) -> s1.length() - s2.length());
		
		for (int i = 0; i < strs.length; i++) {
			int contains = sb.indexOf(strs[i]);
			
			if (contains != -1) {
				sb.replace(contains, contains + strs[i].length(), "");
				cnt++;
				i = cnt;
				continue;
			}
			System.out.println(sb);
		}
		
		return cnt == 0 ? -1 : cnt;
	}
	
	public static void main(String[] args) {
		String[] str2 = {"app", "ap", "p", "l", "e", "ple", "pp"};
		System.out.println(solution(str2, "apple"));
	}
	
}
