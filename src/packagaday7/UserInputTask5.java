package packagaday7;



//HW:2. Write a program that prints number of word represantation number
// where number is 0<= N <=3
// EX: zero =>0//  one => 1
import java.util.Scanner;

public class UserInputTask5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();


        if (s1.equals("zero")) {
            System.out.println(1);

        }
        if (s1.equals("one")) {
            System.out.println((1));
        }
        if (s1.equals("two")) {


            System.out.println(2);
        }
        if (s1.equals("three")) {
            System.out.println(3);
        }


    }
}