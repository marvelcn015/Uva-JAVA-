import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String a = sc.nextLine();
            String b = sc.nextLine();

            char[] A = a.toCharArray();
            char[] B = b.toCharArray();
            Arrays.sort(A);

            for (char c : A) {
                for (int i = 0; i < B.length; i++) {
                    if (c == B[i]) {
                        System.out.print(c);
                        B[i] = 0; // mark the used character
                        break;
                    }
                }
            }
            System.out.println();
        }
      sc.close();
    }
}
