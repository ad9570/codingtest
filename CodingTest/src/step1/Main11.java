package step1;

import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		Main11 m = new Main11();
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
		sc.close();
	}
	
	public boolean validate(int value) {
		return value>=2 && value<=10000;
	}
}