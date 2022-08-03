import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		Main3 m = new Main3();
		while (true) {
			A=sc.nextInt();
			B=sc.nextInt();
			C=sc.nextInt();
			if (m.validate(A) && m.validate(B) && m.validate(C)) {
				break;
			}
		}
        
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}
	
	public boolean validate(int value) {
		return value>=2 && value<=10000;
	}
}