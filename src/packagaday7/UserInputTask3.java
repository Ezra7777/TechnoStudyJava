package packagaday7;

import java.util.Scanner;


//check if number is positive or negative with Scanner
// where number -200 <= N <= 200
// Ex : -123 => negative
// ex : 10 => positive


public class UserInputTask3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println( "Provide a number :" );
        int number = scan.nextInt();


        System.out.println( "Your number is :" + number);
        if (number < 0 ){
            System.out.println( "Negative");
        }
         if (number > 0 ) {
             System.out.println( " Positive ");
         }
         if ( number == 0){
             System.out.println( "Zero");
         }














    }







}
