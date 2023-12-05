import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == 0 & b == 0) {
                return;
            }

            int CO = 0;
            boolean flag = false;

            for (int i = 10; a > 0 | b > 0; a /= 10, b /= 10) {
                if (flag) {
                    if (a % i + b % i + 1 >= 10) {
                        CO++;
                        flag = true;
                    } else
                        flag = false;

                } else {
                    if (a % i + b % i >= 10) {
                        CO++;
                        flag = true;
                    } else
                        flag = false;
                }
            }

            if (CO == 0) {
                System.out.println("No carry operation.");
            } else if (CO == 1) {
                System.out.println(1 + " carry operation.");
            } else {
                System.out.println(CO + " carry operations.");
            }

        }
    }
}
