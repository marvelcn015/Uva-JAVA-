import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sentences = new ArrayList<String>();
        int longest = 0, order = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.length() > longest) {
                longest = line.length();
                order = sentences.size();
            }
            sentences.add(line);
        }

        for (int i = 0; i < longest; i++) {
            for (int j = sentences.size() - 1; j >= 0; j--) {
                if (i < sentences.get(j).length()) {
                    System.out.print(sentences.get(j).charAt(i));
                } else if (j > order) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
