package test1;

import java.util.ArrayList;

public class LHS {

	static public ArrayList<Integer> solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		int c = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (list.get(c) == arr[i]) {
				continue;
			} else {
				list.add(arr[i]);
				c++;
			}
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
		int[] arr2 = {4, 4, 4, 3, 3};
		
		System.out.println(solution(arr1).toString());
		System.out.println(solution(arr2).toString());
	}
	
}
