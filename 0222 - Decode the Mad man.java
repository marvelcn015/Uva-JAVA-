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
            System.out.println();
        }
    }
}
/*在這段程式碼中，keyboard.indexOf(letter) 用來取得 letter 在 keyboard 字串中的位置。
如果 letter 存在於 keyboard 中，indexOf() 會回傳該字元在 keyboard 中的索引；
如果 letter 不存在於 keyboard 中，則回傳 -1。
這個索引值被存儲在 flag 變數中，然後根據該索引值來決定輸出字元。*/
