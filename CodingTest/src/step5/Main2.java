package step5;

public class Main2 {

	public static void main(String[] args) {
		Main2 main = new Main2();
		StringBuilder sb = new StringBuilder();
		boolean[] arr = new boolean[10001];
		
		for (int i = 1; i < arr.length; i++) {
			if (main.d(i) < 10001)
				arr[main.d(i)] = true;
			if (!arr[i])
				sb.append(i).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public int d(int n) {
		int sum = n;
		
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}

}
