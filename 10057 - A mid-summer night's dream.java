import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            Arrays.sort(array);
            int mid1 = array[n / 2];
            int mid2 = array[(n - 1) / 2];

            int satisfy = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] == mid1 || array[i] == mid2) {
                    satisfy++;
                }
            }

            int possibility = mid2 - mid1 + 1;
            System.out.println(mid1 + " " + satisfy + " " + possibility);
        }

        sc.close();
    }
}
