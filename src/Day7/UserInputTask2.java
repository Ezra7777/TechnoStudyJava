package Day7;




import java.util.Scanner;


//Todo Task 2:
//Write a program that ask two number,
//in your console it should print same as below:
// Provide a first number :
//  3
//Your first number is 3
// Provide a second number :
// 5
// Your second number is 5
// Task 3.
// continue task 2. print same of two numbers
// final Line of you console should be like this
//Sum 8

public class UserInputTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println( "Provide a first number :");
        int first= scan.nextInt( );
        System.out.println( "Your first number is " + first);

        System.out.println( "Provide a second number is + second");
        int second= scan.nextInt ( );
        System.out.println( "Your second number is " + second);

        int sum= first + second;
        System.out.println( "sum is " + sum);


        System.out.println("---------------");


        Scanner scan1 = new Scanner (System.in);
        System.out.println("Provide a first number:");
        int First= scan.nextInt ( );

        System.out.println(" Provide a second number");
        int Second=scan.nextInt();
        System.out.println("Your second number is"+ second );

        int Sum= First =Second;
        System.out.println( "Sum is + Sum");










    }


}
