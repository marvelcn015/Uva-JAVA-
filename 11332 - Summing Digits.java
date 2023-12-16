import java.util.*;

public class Main {

    static long solve(long x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            long n = sc.nextLong();
            if (n == 0)
                return;

            while (n >= 10) {
                n = solve(n);
            }

            System.out.println(n);
        }
      sc.close();
    }
}
