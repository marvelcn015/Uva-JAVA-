import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            String line = sc.nextLine();
            if (line.equals("0")) {
                return;
            }
            int sumOdd = 0;
            int sumEven = 0;

            for (int i = 0; i < line.length(); i++) {
                if (i % 2 == 0) {
                    sumEven += Character.getNumericValue(line.charAt(i));
                } else {
                    sumOdd += Character.getNumericValue(line.charAt(i));
                }
            }

            if (Math.abs(sumEven - sumOdd) % 11 == 0 | sumEven == sumOdd) {
                System.out.println(line + " is a multiple of 11.");
            } else
                System.out.println(line + " is not a multiple of 11.");
        }
    }
}
