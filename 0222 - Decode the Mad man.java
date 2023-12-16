import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keyboard = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
        while (sc.hasNextLine()) {
            String line = sc.nextLine().toLowerCase();
            for (int i = 0; i < line.length(); i++) {
                char letter = line.charAt(i);
                int flag = keyboard.indexOf(letter);
                if (flag == -1) {
                    System.out.print(letter);
                } else {
                    System.out.print(keyboard.charAt(flag - 2));
                }
            }
        }
        System.out.println();
    }
}
