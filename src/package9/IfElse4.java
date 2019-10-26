package package9;

import java.util.Scanner;

public class IfElse4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System .in);

        //write a program that print temperature in human rea  readable words
        //ex: 70 =>hot

        int temperature = scan.nextInt();
        if(temperature>=70) {//>=70
            System.out.println("HOT");
        }else if (temperature<70 && temperature >=50 ){
            System.out.println( "Warm");

        }else if (temperature < 50 && temperature >=20) {
            System.out.println("cold");
        }else {
            System.out.println( "frezzing");
        }




            //cold
        //freezing


        int  Temperature  =scan.nextInt();
        if ( temperature >= 70){//70<=
            System.out.println( "hot");
        }else if (temperature < 7 && temperature >=0){ // 50 <= t<70
            System.out.println( "cold");
        }else if (temperature  > 7 && temperature <=0) {
            System.out.println( "warm" );
        }










    }










}
