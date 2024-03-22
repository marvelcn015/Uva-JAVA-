import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            long sum = sc.nextLong();
            long count = 0;
            int i = a;
            for (; count < sum; i++) {
                count += i;
            }

            System.out.println(i - 1);
        }
    }
}
