import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main11 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String dice = bf.readLine();
		
		StringTokenizer st = new StringTokenizer(dice);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int count = 0, prize = 0;
		
		for (int i = 0; i < 3; i++) {
			if (i != list.indexOf(list.get(i))) {
				prize = ++count <= 1 ? 1000 + list.get(i) * 100 : prize * 10;
			}
		}
		
		if (count == 0) {
			list.sort(Comparator.reverseOrder());
			prize = list.get(0) * 100;
		}
		
		System.out.println(prize);
	}

}
