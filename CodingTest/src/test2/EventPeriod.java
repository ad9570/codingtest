package test2;

public class EventPeriod {

	public int solution(int[] estimates, int k) {
		int sum = 0;
		
		for (int i = 0; i < k; i++)
			sum += estimates[i];
		
		int max = sum;
		
		for (int i = k; i < estimates.length; i++) {
			sum = sum - estimates[i - k] + estimates[i];
			max = Math.max(max, sum);
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] e1 = {5, 1, 9, 8, 10, 5};
		int[] e2 = {10, 1, 10, 1, 1, 4, 3, 10};
		EventPeriod ep = new EventPeriod();
		
		System.out.println(ep.solution(e1, 3));
		System.out.println(ep.solution(e2, 6));
	}
	
}
