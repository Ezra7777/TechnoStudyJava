package Day7;
     //1.write a program that prints word represantation of your number
     // where number is 0 <=N <= 3
     // ex:0 => zero
     // ex:3 =>  three

      //HW:2. Write a program that prints number of word represantation number
      // where number is 0<= N <=3
      // EX: zero =>0
      //  one => 1

import java.util.Scanner;

public class UserInputTask4 {

    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);

      int number =scan.nextInt ( );
      if (number ==0 ){
          System.out.println( "zero");
      }
       if ( number ==1){
           System.out.println( " one");
       }

       if ( number==2 ){
           System.out.println( " two");
       }

       if ( number ==3){
           System.out.println( "three");
       }



        int q =scan.nextInt();

        if (q<0){
            System.out.println( "zero");
        }
        if (q<1){
        }
        System.out.println( "0ne");

        if (q<2){
            System.out.println( " two");
        }

        if ( q<3) {
            System.out.println("three");


        }





        }



    }







