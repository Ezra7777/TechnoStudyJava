package PckageDay12;
import java.util.Scanner;
public class LoopBreak {

    public static void main(String[] args) {


        int number = 0;
        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
            if (i == 5) {
                number = i;
                break;
            }
        }
        System.out.println("Your number is " + number);


    }



}












