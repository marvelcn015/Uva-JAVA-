import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            int sum = 0;
            int max = 1;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                int temp;
                if (c >= '0' && c <= '9') {
                    temp = c - '0';
                } else if (c >= 'A' && c <= 'Z') {
                    temp = c - 'A' + 10;
                } else if (c >= 'a' && c <= 'z') {
                    temp = c - 'a' + 36;
                } else {
                    continue;
                }


                if (max < temp) {
                    max = temp;
                }
                sum += temp;
            }


            int i = max;
            for (; i < 62; i++) {
                if (sum % i == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
            if (i == 62) {
                System.out.println("such number is impossible!");
            }
        }
    }
}
