package PckageDay12;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber2 {
    public static void main(String[] args) {

        //part1
        //  end loop if you failed to guess a number after 3 try
        //part2
        //  fix if statements, check numbers correctly

        Random rand=new Random( );
        int randomNumber=rand.nextInt(10);
        Scanner scan=new Scanner(System.in);
        int myNumber= -2;
        int i=0;
         while(myNumber !=randomNumber){
             i++;
             myNumber=scan.nextInt();

             if (myNumber>randomNumber){
                 System.out.println( "you failed game");
             }else{
                 System.out.println( "number is correct");



             }
         }












    }
}
