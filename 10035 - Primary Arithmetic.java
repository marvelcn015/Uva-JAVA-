import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0)
				return;

			int count = 0;
			boolean flag = false;
			int temp = 0;
			for (; a > 0 || b > 0; a /= 10, b /= 10) {

				if (flag) {
					temp = a % 10 + b % 10 + 1;
					flag = false;
				} else {
					temp = a % 10 + b % 10;
				}

				if (temp >= 10) {
					flag = true;
					count++;
				}
			}

			if (count == 0) {
				System.out.println("No carry operation.");
			} else if (count == 1) {
				System.out.println("1 carry operation.");
			} else {
				System.out.println(count + " carry operations.");
			}
		}
	}
}
