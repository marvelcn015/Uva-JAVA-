import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> m = new TreeMap<Character, Integer>();
        int set = sc.nextInt();
        sc.nextLine();
        for (int l = 0; l < set; l++) {
            String line = sc.nextLine().toUpperCase();
            for (int i = 0; i < line.length(); i++) {
                char C = line.charAt(i);
                if (Character.isLetter(C)) {
                    if (m.containsKey(C)) {
                        m.put(C, m.get(C) + 1);
                    } else {
                        m.put(C, 1);
                    }
                }
            }
        }

        for (int count = Collections.max(m.values()); count > 0; count--) {
            for (Character C : m.keySet()) {
                if (m.get(C) == count) {
                    System.out.println(C + " " + count);
                }
            }
        }
    }
}
