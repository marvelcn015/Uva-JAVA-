import java.util.*;

public class Main {

    static int set = 1;

    public static int solve(int m) {

        if (m == 1)
            return set;

        if (m % 2 != 0) {
            m = 3 * m + 1;
        } else {
            m /= 2;
        }

        set++;
        return solve(m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int ans = 0;

            int a = Math.min(i, j);
            int b = Math.max(i, j);

            for (int k = a; k <= b; k++) {
                ans = Math.max(ans, solve(k));
                set = 1;
            }
            System.out.println(i + " " + j + " " + ans);
        }
    }
}
//冷知識: 這題遞迴ㄉ演算法，叫做 Collatz conjecture（考拉茲猜想）。
