import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] week = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        // 1/1 would be Sat.

        int set = sc.nextInt();
        while (set-- > 0) {
            int M = sc.nextInt();
            int D = sc.nextInt();
            int sum = D - 1;
            for (int i = 0; i < M - 1; i++) {
                sum += month[i];
            }
            System.out.println(week[sum %= 7]);
        }
        sc.close();
    }
}
