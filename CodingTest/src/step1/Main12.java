package step1;

import java.util.Scanner;

public class Main12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one, two;
		Main12 m = new Main12();
		while (true) {
			one=sc.nextInt();
			two=sc.nextInt();
			if (m.validate(one) && m.validate(two)) {
				break;
			}
		}
		
		int three = one * (two % 10);
		int four = one * (two % 100 / 10);
		int five = one * (two / 100);
		int six = three + four * 10 + five * 100;
        
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		sc.close();
	}
	
	public boolean validate(int value) {
		return value>=100 && value<=999;
	}
}
