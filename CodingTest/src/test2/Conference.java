package test2;

public class Conference {

	public int solution(int[][] arr) {
		int max = 1;
		
		for (int i = 0; i < arr.length; i++) {
			boolean[] scheduled = new boolean[40_000_001];
			int cnt = 1;
			
			for (int j = 2 * arr[i][0] + 1; j <= 2 * arr[i][1] - 1; j++)
				scheduled[j] = true;
			
			Loop:
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j][0] == arr[j][1]) {
					if (scheduled[arr[j][0]])
						continue Loop;
					else
						scheduled[arr[j][0]] = true;
				}
				
				for (int k = arr[j][0]; k < arr[j][1]; k++) {
					if (scheduled[k])
						continue Loop;
				}
				
				for (int k = arr[j][0]; k < arr[j][1]; k++) {
					if (k == arr[j][0])
					scheduled[k] = true;
				}
				
				cnt++;
			}
			
			max = Math.max(max, cnt);
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int a1[][] = {{1, 2}, {2, 4}, {2, 2}};
		int a2[][] = {{1, 4}, {2, 6}, {4, 7}};
		Conference c = new Conference();
		
		System.out.println(c.solution(a1));
		System.out.println(c.solution(a2));
	}
	
}
