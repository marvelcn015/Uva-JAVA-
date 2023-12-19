import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '"') {
                    count++;
                    if (count % 2 == 1) {
                        System.out.print("``");
                    } else {
                        System.out.print("''");
                    }
                } else
                    System.out.print(c);
            }
            System.out.println();
        }
        sc.close();
    }
}
