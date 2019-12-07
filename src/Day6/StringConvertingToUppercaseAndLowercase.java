package Day6;

public class StringConvertingToUppercaseAndLowercase {

    // You can convert Strings to  uppercase and Lowercase
    // using the methods toUpperCase() and toLowerCase()

    public static void main(String[] args) {

        String s1 = " techno study";
        //to convert to uppercase TECHNO STUDY use toUpperCase ();
        System.out.println(s1.toUpperCase ());


        System.out.println("-------------------");
        String s2="Hello World";
        System.out.println(s2 );// Hello World
        System.out.println( s2.toUpperCase ());//Hello World ,to make it UUPERCASE


        System.out.println(s2.toLowerCase( )); // hello world ,to make it lowercase

        //TODO Task 1:
        //print your name in "UPPERCASE"
        // EX:Michael Jackson =>Michael jackson
        String fn="MiChAel";
        String ln= "JACKsoN";
        System.out.println( fn.toUpperCase ());
        System.out.println( ln.toLowerCase());



    }







}
