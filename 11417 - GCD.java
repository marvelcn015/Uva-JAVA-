import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {

			int N = sc.nextInt();
			if (N == 0)
				return;
			int G = 0;
			for (int i = 1; i < N; i++) {
				for (int j = i + 1; j <= N; j++) {
					G += GCD(i, j);
				}
			}
			System.out.println(G);
		}
	}

	public static int GCD(int x, int y) {

		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}

		return x;
	}
}
