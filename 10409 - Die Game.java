import java.util.*;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] move = { "north", "south", "east", "west" };
        while (sc.hasNextInt()) {
            int step = sc.nextInt();
            if (step == 0)
                return;


            int one = 1;
            int two = 2;
            int three = 3;
            int four = 4;
            int five = 5;
            int six = 6;


            while (step-- > 0) {
                String line = sc.next();


                switch (line) {


                    case ("north"): {
                        int temp = one;
                        one = five;
                        five = six;
                        six = two;
                        two = temp;
                        break;
                    }


                    case ("south"): {
                        int temp = one;
                        one = two;
                        two = six;
                        six = five;
                        five = temp;
                        break;
                    }


                    case ("east"): {
                        int temp = one;
                        one = three;
                        three = six;
                        six = four;
                        four = temp;
                        break;
                    }


                    case ("west"): {
                        int temp = one;
                        one = four;
                        four = six;
                        six = three;
                        three = temp;
                        break;
                    }


                }
            }
            System.out.println(one);


        }


    }
