package MyHomeworkPackage;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {


        // Write a program the prompts the user to input a positive integer.
        // It should the print the multiplication table of the number.
        // Ex: if user enters 3
        //Then it should print 3,6,9,12,15,18,21,24,27,30


        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number");
        int number = scan.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(number * i);


        }
    }
}























