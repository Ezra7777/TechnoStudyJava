package Day6;

public class StringIndexOf {
    // Searching in String With IndexOf ( )
    public static void main(String[] args) {

        System.out.println( " EX   1-------------------" );
                 // 01234
        String s1 ="Hello";
        System.out.println( s1.indexOf("llo"));


        System.out.println( "EX 2 --------------------");
        // indexOf get first occurrance of your string
        String s2 ="Techno Study ";
        int indexS2= s2.indexOf ( "ech");
        System.out.println(indexS2);


        System.out.println("EX 3----------------------");
        //lastIndexOf get last occurrence of your searching string
        String s3= " so something so many";
        int indexS3=s3.lastIndexOf("so");
        System.out.println(indexS3);


        System.out.println("TASK 1---------------------");
        //Task 1: write code that count length of string and prints sum of length and index of "e"
        // ex: '
        // "techno"=> 6+1=>7
        // hint : length () , indexOf ()
            //01234567
        String str = "techenoe";
        int length = str.length(); //8
        int index = str.lastIndexOf("ecqweeqweqwe");//-1


        int lenght = 8;
        int sum=lenght+index;//8+ (-1)
        System.out.println(sum);//7


    }







}
