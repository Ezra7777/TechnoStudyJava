package Day9;

import java.util.Scanner;

public class UserInput1 {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);


        System.out.println("Enter Your Name");
        String name=scan.nextLine();
        System.out.println( "Welcome"+ name + "!!!");
        scan.close();//why do we have to close
        //because it is void it means finish last statement






    }







}
