import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int set = sc.nextInt();
        while (set-- > 0) {
            int sum = sc.nextInt();
            int abs_dif = sc.nextInt();

            int a = (sum + abs_dif) / 2;
            int b = sum - a;

            if (a < 0 || b < 0 || (sum + abs_dif) % 2 == 1) {
                System.out.println("impossible");
            } else {
                System.out.println(a + " " + b);
            }

        }
    }
}
