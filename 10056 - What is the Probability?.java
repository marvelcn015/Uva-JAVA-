import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int set = sc.nextInt();
        while (set-- > 0) {
            int all = sc.nextInt();
            double win_rate = sc.nextDouble();
            double lose_rate = 1 - win_rate;
            int index = sc.nextInt();

            if (win_rate > 0) {
                double ans = Math.pow(lose_rate, index - 1) * win_rate / (1 - Math.pow(lose_rate, all));
                System.out.printf("%.4f", ans);
                System.out.println();
            } else {
                System.out.println("0.0000");
            }
        }
    }
}
