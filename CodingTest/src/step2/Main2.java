package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(bf.readLine());
		
		switch (score / 10) {
	        case 10: case 9:
	            System.out.println("A");
	            break;
	        case 8:
	            System.out.println("B");
	            break;
	        case 7:
	            System.out.println("C");
	            break;
	        case 6:
	            System.out.println("D");
	            break;
	        default:
			    System.out.println("F");
		}
		bf.close();
	}
	
}