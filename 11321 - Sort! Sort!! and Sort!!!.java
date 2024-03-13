//這題還在吃TLE，我很抱歉＞＜
//至少ZOJ有過...

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(n + " " + m);
            if (n == 0 && m == 0) {
                return;
            }

            ArrayList<Integer> arrayAscend = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arrayAscend.add(sc.nextInt());
            }

            Collections.sort(arrayAscend);
            ArrayList<Integer> arrayDescend = new ArrayList<>(arrayAscend);
            Collections.sort(arrayDescend, Collections.reverseOrder());

            for (int remainder = -m + 1; remainder < m; remainder++) {
                for (int num : arrayDescend) {
                    if (Math.abs(num) % 2 == 1 && num % m == remainder) {
                        System.out.println(num);
                    }
                }

                for (int num : arrayAscend){
                    if (Math.abs(num) % 2 == 0 && num % m == remainder) {
                        System.out.println(num);
                    }
                }
            }
        }
    }
}
