package MyHomeworkPackage;

import java.util.Scanner;

public class IfElseStatementHomework2 {

    //Find the Largest Number Among Three Numbers using user Input
    //to find largest number among the three numbers using nested if
    // int a=34;
    //  int b=45;
    //  int c=78;
    //
    //int num1=10,num2=20,num3=7;
    //output 20 is the largest number


    public static void main(String[] args) {
        int Num1=34;
        int Num2=45;
        int Num3=78;
        Scanner scan= new Scanner(System.in);
        System.out.println(" Input the 1 st number:");
        int num1 =scan.nextInt();

        System.out.println("Input the second number");
        int num2=scan.nextInt();

        System.out.println( "Input the third number");
        int num3=scan.nextInt();

        if (num1>num2);
        if (num1>num3);
        System.out.println("Greatest number:" + num1);

        if (num2>num1);
        if (num2>num3);
        System.out.println("Greatest number:"  + num2);

        if (num3>num1);
        if(num3>num2);
        System.out.println("Greatest number:" +num3);



    }

}
