package Day9;


//write a program which will tell you day of week
//1 2 3 4 5 6 7
//Monday,Tuesday etc..
//1 =>Monday
//7 => Sunday

import java.util.Scanner;

public class JavaSwitschInt2 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner (System.in) ;
        int dayOfWeek=scanner.nextInt( );

        switch (dayOfWeek){
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println( "Tuesday");

            break;
            case 3 :
                System.out.println( "Wednesday");
             break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println( "saturday");
                break;
            case 7 :
                System.out.println( "sunday");
                break;




                //233456798754 when you see that error it is RUN TIME ERROR
                //System.in ; should be like this
                //when you do this System.in.. //this is the COMPILE error


        }

     //   default:
        System.out.println("not in range of week");

    }
}
