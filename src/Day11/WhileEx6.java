package Day11;


import java.util.Scanner;

public class WhileEx6 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Write a text");
            String line = scan.nextLine();

            if (line.equals("quit")) {

                break;

            }
            if (line.contains("#") || line.contains("@") || line.contains("$") || line.contains("8")) {

            } else {
                System.out.println("Weak password");
            }


            System.out.println("Strong password");


            //part1.check if the @,$,* symbols also for a strong password
            //hint: fill statement with conditions
            //
            // line;

            //part3. check if it's only uppercase "use Lowercase Letters
            // Hint: Line .toUpperCase( ) ;
            //    Line.equals( ) ;

            String lineUpperCase = line.toUpperCase();
            //"ABCDEFG"== "ABCDEFG"
            if (line.equals(lineUpperCase)) {

                System.out.println("use lowercase letter");


                // PART4. CHECK if it's only lowercase letters" use "uppercase letters"

                String lineLowercase = line.toLowerCase();
                if (line.equals(lineLowercase)) {
                    System.out.println("use uppercase letters");
                }


            }


        }
    }
}

