import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            int[] value = new int[num];
            for (int i = 0; i < num; i++) {
                value[i] = sc.nextInt();
            }

            boolean flag = true;
            HashSet<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < num - 1; i++) {
                int diff = Math.abs(value[i] - value[i + 1]);
                if (diff > num - 1 || diff < 1) {
                    flag = false;
                    break;
                } else {
                    set.add(diff);
                }
            }

            if (flag && set.size() == num - 1) {
                System.out.println("Jolly");
            } else {
                System.out.println("Not jolly");
            }
        }
      
      sc.close();
    }
}
