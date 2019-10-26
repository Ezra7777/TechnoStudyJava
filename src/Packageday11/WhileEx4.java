package Packageday11;

import java.util.Scanner;

public class WhileEx4 {
    public static void main(String[] args) {


        //part3:continue part 2.if provided string is equals to your name
        //program should print your surname

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a string");
        String s = scan.nextLine();
        while (s.length() == 4) {
            s = scan.nextLine();
            System.out.println("Ozturk");
        }

        String line = " ";
        while (!line.equals("quit")) {
            System.out.println("Write a string");
            line = scan.nextLine();


            // Part2, continue part1 but also check for length() of string
            // if length is bigger than 10, program should say that string is too large
            // ex:
            // in the while loop....
            //     wjherjwhejrhwejrh => "string is too large"


            // part3. continue part2, if provided string is equals to your name
            // program should print your surname
            if (line.equals("Max")) {
                System.out.println("Adams");
            }


        }


    }
}
