import java.util.*;

public class Main {

    static long kuti = 10000000;
    static long lakh = 100000;
    static long hajar = 1000;
    static long shata = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int set = 1; sc.hasNext(); set++) {
            long num = sc.nextLong();
            System.out.printf("%4d.", set);
            if (num == 0) {
                System.out.println(" 0");
                continue;
            }
            if (num >= kuti) {
                solve(num / kuti);
                System.out.print(" kuti");
                num %= kuti;
            }
            solve(num);
            System.out.println();
        }
    }

    public static void solve(long x) {
        if (x >= kuti) {
            System.out.print(" " + x / kuti + " kuti");
            x %= kuti;
        }
        if (x >= lakh) {
            System.out.print(" " + x / lakh + " lakh");
            x %= lakh;
        }
        if (x >= hajar) {
            System.out.print(" " + x / hajar + " hajar");
            x %= hajar;
        }
        if (x >= shata) {
            System.out.print(" " + x / shata + " shata");
            x %= shata;
        }
        if (x > 0) {
            System.out.print(" " + x);
        }
    }
}
