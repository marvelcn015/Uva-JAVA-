import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        String[] country = new String[line];

        for (int i = 0; i < line; i++) {
            country[i] = sc.next();
            sc.nextLine();
        }

        Arrays.sort(country);
        int t = 1;
        for (int i = 0; i < line - 1; i++) {
            if (country[i].equals(country[i + 1])) {
                t++;
                if (i == line - 2) {
                    System.out.println(country[i] + " " + t);
                }
            } else {
                System.out.println(country[i] + " " + t);
                if (i == line - 2) {
                    System.out.println(country[i + 1] + " " + t);
                }
                t = 1;
            }
        }
    }
}
