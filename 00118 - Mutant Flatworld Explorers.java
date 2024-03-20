import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x_margin = sc.nextInt();
        int y_margin = sc.nextInt();
        int[][] arr = new int[x_margin + 1][y_margin + 1];

        int[] dx = { 0, 1, 0, -1 };
        int[] dy = { 1, 0, -1, 0 };
        // N, E, S, W

        HashMap<Integer, Character> map1 = new HashMap<Integer, Character>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        map1.put(0, 'N');
        map1.put(1, 'E');
        map1.put(2, 'S');
        map1.put(3, 'W');
        map2.put('N', 0);
        map2.put('E', 1);
        map2.put('S', 2);
        map2.put('W', 3);

        while (sc.hasNextLine()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            char direction = sc.nextLine().charAt(1);
            String move = sc.nextLine();

            int current_x = 0;
            int current_y = 0;

            int D = map2.get(direction);
            boolean lost = false;
            for (int i = 0; i < move.length(); i++) {

                lost = false;

                if (move.charAt(i) == 'F') {
                    current_x = x + dx[D];
                    current_y = y + dy[D];
                    if (current_x >= 0 && current_x <= x_margin && current_y >= 0 && current_y <= y_margin) {
                        x = current_x;
                        y = current_y;
                    } else {
                        if (arr[x][y] == 1) {
                            continue;
                        } else {
                            lost = true;
                            arr[x][y] = 1;
                            System.out.println(x + " " + y + " " + map1.get(D) + " LOST");
                            break;
                        }
                    }
                } else if (move.charAt(i) == 'R') {
                    D = (D + 1) % 4;
                } else {
                    D = (D + 3) % 4;
                }
            }

            if (!lost) {
                System.out.println(x + " " + y + " " + map1.get(D));
            }
        }
    }
}
