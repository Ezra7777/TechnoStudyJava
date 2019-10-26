package package9;


import java.util.Scanner;

public class SwitchStatementHomework2 {

    // write a code to find out if a day is weekday or a weekend day.use switch statement
    //
    //Input 5
    //Output:
    //Friday is Weekday

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of the day");


        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday is Weekday");
                break;

            case 2:
                System.out.println("Tuesday is Weekday");
                break;

            case 3:
                System.out.println("Wednesday is Weekday");
                break;

            case 4:
                System.out.println("Thursday is Weekday");
                break;

            case 5:
                System.out.println("Friday is Weekday");
                break;

            case 6:
                System.out.println("Saturday is Weekend");
                break;

            case 7:
                System.out.println("Sunday is Weekend");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}



