import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1;; i++) {
			int sq = i * i;
			if (sq > 100000) {
				break;
			} else {
				list.add(sq);
			}
		}

		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a == 0 && b == 0)
				return;

			int count = 0;
			for (int num : list) {
				if (num >= a && num <= b) {
					count++;
				}
			}

			System.out.println(count);
		}
	}
}
