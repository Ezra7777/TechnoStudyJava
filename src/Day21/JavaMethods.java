package Day21;

import java.util.Scanner;

public class JavaMethods {
    public static void main(String[] args) {


        //    https://www.w3resource.com/java-exercises/method/index.php
//    https://www.w3resource.com/java-tutorial/java-class-methods-instance-variables.php

        //   AddTwoNumber(4, 56);


    //   2. Write a Java method to compute the average of three numbers. Go to the editor
//    Test Data:
//    Input the first number: 25
//    Input the second number: 45
//    Input the third number: 65
//    Expected Output:
//
//    The average value is 45.0

    Scanner scan = new Scanner(System.in);
             System.out.println("write a first number");
    int num1 = scan.nextInt();
             System.out.println("write a second number");
    int num2 = scan.nextInt();
             System.out.println("write a third number");
    int num3 = scan.nextInt();
    int sum = num1 + num2;

             System.out.println();

             System.out.println("sum:"+sum);



}
}
