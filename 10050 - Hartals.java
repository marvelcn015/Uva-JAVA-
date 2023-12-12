import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        while (cases-- > 0) {

            int days = sc.nextInt();
            int parties = sc.nextInt();

            HashSet<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < parties; i++) {
                int loop = sc.nextInt();

                for (int date = 1; date <= days; date++) {
                    if (date % 7 != 6 && date % 7 != 0 && date % loop == 0) {
                        set.add(date);
                    }
                }
            }

            System.out.println(set.size());
        }
        sc.close();
    }
}
