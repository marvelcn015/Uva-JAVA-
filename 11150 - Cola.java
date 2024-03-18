import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int count = n;
            int quotient = 0;
            int remainder = 0;

            while (n >= 3) {
                quotient = n / 3;
                remainder = n % 3;
                count += quotient;
                n = quotient + remainder;
            }

            if (n == 2)
                count++;
            System.out.println(count);
        }
    }
}
