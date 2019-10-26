package day2;

public class IntegerExample{
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 50;
        int d = 20;
        int e = 15;


        int sum = 10 + 30 + 50 + 20 + 15;

        System.out.println("Total sum 1 : " + sum);
        a = 25;
        b = 15;
        c = 35;
        d = 20;
        e = 130;

        // int result = ( a + b + c + d + e ) / 5;
        int result = a + b + c + d + e;
        System.out.println("Sum:  " + result);

        double average = result / 5.0;
        System.out.println("average: " + average);

        System.out.println(a + b + c + d + e + average / 5);
        System.out.println(" average + average ");



    }
}


