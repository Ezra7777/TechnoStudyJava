package day2;


public class IfStatement {
    public static void main(String[] args) {
        boolean statement = false;

        if (statement) {
            System.out.println(" statement is true ");
        }
        int year = 2000;
        if (year > 2000) {

            System.out.println("It's  20th century ");

        }

        if (year == 2000) {

            System.out.println(" It's millenium ");
        }


        if (year < 2000) {
            System.out.println("It's  19th century ");
        }
        int temperature = 100;
        if (temperature > 70) {

            System.out.println(" It's hot ");

        }

        if (temperature < 70 && temperature >= 60) {

            System.out.println("It's warm ");

        }
        if (temperature < 60 && temperature >= 20) {

        }
        if (temperature < 20) {

            System.out.println("Freezing ");
        }



    }
}














