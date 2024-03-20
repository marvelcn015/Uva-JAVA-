import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sets = sc.nextInt();
        sc.nextLine();
        for (int set = 1; set <= sets; set++) {
            String line1 = sc.nextLine();
            String line2 = sc.nextLine();
            int a = BtoD(line1);
            int b = BtoD(line2);
            int result = GCD(a, b);


            System.out.print("Pair #" + set + ": ");
            if (result == 1) {
                System.out.println("Love is not all you need!");
            } else {
                System.out.println("All you need is love!");
            }
        }
    }


    static int BtoD(String line) {
        int num = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '1')
                num += 1 << (line.length() - 1 - i);
        }


        return num;
    }


    static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
