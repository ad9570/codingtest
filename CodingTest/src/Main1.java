
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
        Main1 m = new Main1();
		while(true) {
			A=sc.nextInt();
			B=sc.nextInt();
			if (m.validate(A) && m.validate(B)) {
				break;
			}
		}
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}
    
    public boolean validate(int value) {
		return value>=1 && value<=10000;
	}
}