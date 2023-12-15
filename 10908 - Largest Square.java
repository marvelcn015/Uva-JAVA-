import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int set = sc.nextInt();
        while (set-- > 0) {

            int m = sc.nextInt();
            int n = sc.nextInt();
            int q = sc.nextInt();
            System.out.println(m + " " + n + " " + q);
            char[][] matrix = new char[m][n];

            for (int i = 0; i < m; i++) {
                String line = sc.next();
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = line.charAt(j);
                }
            }
            while (q-- > 0) {
                int r = sc.nextInt();
                int c = sc.nextInt();
                char center = matrix[r][c];

                int range = 0;
                boolean flag = true;
                while (flag) {

                    range++;
                    int rStart = r - range;
                    int rEnd = r + range;
                    int cStart = c - range;
                    int cEnd = c + range;

                    if (rStart < 0 || rEnd >= m || cStart < 0 || cEnd >= n) {
                        break;
                    }

                    for (int i = rStart; i <= rEnd; i++) {
                        for (int j = cStart; j <= cEnd; j++) {
                            if (matrix[i][j] != center) {
                                flag = false;
                            }
                        }
                    }
                }
                System.out.println(range * 2 - 1);
            }
        }
        sc.close();
    }
}
