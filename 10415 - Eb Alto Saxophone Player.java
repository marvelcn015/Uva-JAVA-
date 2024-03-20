import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Character, String> map = new TreeMap<Character, String>();
        map.put('c', "0111001111");
        map.put('d', "0111001110");
        map.put('e', "0111001100");
        map.put('f', "0111001000");
        map.put('g', "0111000000");
        map.put('a', "0110000000");
        map.put('b', "0100000000");
        map.put('C', "0010000000");
        map.put('D', "1111001110");
        map.put('E', "1111001100");
        map.put('F', "1111001000");
        map.put('G', "1111000000");
        map.put('A', "1110000000");
        map.put('B', "1100000000");

        int set = sc.nextInt();
        sc.nextLine();
        while (set-- > 0) {
            String line = sc.nextLine();
            String present_pose = "0000000000";
            String target_pose = "";
            int[] count = new int[10];
            Arrays.fill(count, 0);
            for (int i = 0; i < line.length(); i++) {
                target_pose = map.get(line.charAt(i));
                for (int j = 0; j < 10; j++) {
                    if (present_pose.charAt(j) == '0' && target_pose.charAt(j) == '1') {
                        count[j]++;
                    }
                }
                present_pose = target_pose;
            }

            for (int i = 0; i < 10; i++) {
                System.out.print(count[i]);
                if (i != 9) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
