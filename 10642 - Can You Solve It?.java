import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sets = sc.nextInt();
		for (int set = 1; set <= sets; set++) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			long t_x = sc.nextLong();
			long t_y = sc.nextLong();

			long to_start = (x + y) * (x + y + 1) / 2 + x;
			long to_target = (t_x + t_y) * (t_x + t_y + 1) / 2 + t_x;
			long count = to_target - to_start;

			System.out.println("Case " + set + ": " + count);
		}
	}
}
