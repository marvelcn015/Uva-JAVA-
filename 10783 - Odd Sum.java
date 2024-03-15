import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int set = sc.nextInt();
		int Case = 0;
		while (set-- > 0) {
			Case++;
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a % 2 == 0)
				a++;
			int sum = 0;
			for (int i = a; i <= b; i += 2) {
				sum += i;
			}

			System.out.println("Case " + Case + ": " + sum);
		}

	}
}
