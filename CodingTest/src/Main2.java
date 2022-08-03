
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y;
        int diff = 2562 - 2019;
		while (true) {
			y=sc.nextInt();
			if (y>=1000 & y<=3000) {
				break;
			}
		}
        
		System.out.println(y-diff);
	}
}