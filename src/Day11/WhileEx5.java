package Day11;


import java.util.Scanner;

public class WhileEx5 {
    public static void main(String[] args) {

        int i = 0;
        while (true) {
            i++;
            if (i == 5) {
                break;
            }
            System.out.println(i);


            Scanner s = new Scanner(System.in);
            System.out.println("begin");
            while (true) {
                System.out.println("Write text: ");
                String str = s.nextLine();

                if (str.equals("quit")) {
                    break;
                }
                if (str.length() >= 10) {
                    System.out.println("string is too large");
                }
            }

            System.out.println("end");
        }

    }

}





