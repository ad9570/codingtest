package cr;

public class Swc {

	public static void main(String[] args) {
		int a = 1, b = 5;
		
		for (int i = 0; i < b; i++) {
			a += i;
			
			if (a > b) {
				a *= i;
				a *= (2 * b);
				break;
			}
			
			i++;
		}
		
		System.out.println(a);
	}
	
}
