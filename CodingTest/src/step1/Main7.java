package step1;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
        Main7 m = new Main7();
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
		sc.close();
	}
    
    public boolean validate(int value) {
		return value>=1 && value<=10000;
	}
}