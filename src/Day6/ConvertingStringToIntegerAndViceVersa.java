package Day6;


public class ConvertingStringToIntegerAndViceVersa {

    public static void main(String[] args) {

        //valueof () which one can be used to convert
        //a number to a string
        //Converting integer to string

        int number= 10;
        String s1 = String.valueOf(number);
        System.out.println( s1 + 10 ) ; // " 10 + 10 => 1010
        System.out.println( "10 + 10"); // "10 "+ 10 => 1010
        System.out.println( number +10);//20


        System.out.println("------------------------");
        //converting String to integer
        String s2= " 30";
        int n2 = Integer.valueOf(s2);
        //30 + 10 => 40
        System.out.println(s2 + 10 ); //"30 " + 10 => 3010
        System.out.println( n2 + 10); // 30 = 10 => 40

        System.out.println("----------------------");
        //Todo Task 1= write a program that
        // tahe strings and give us sum result
        //ex: s1="100" ,s2= "300" => 400
        String a1= "100";
        String a2= "300";


        int num1= Integer.valueOf(a1) ;
        int num2=Integer.valueOf(a2);
        System.out.println(num1+num2);


        System.out.println("----------------------");
        //Todo Task2: write a program that
        //takes this values and prints the average
        // values =[ "5" , 50, 2.24, "22" , 50000 ];
         String v1 = "5";
         int v2 = 50;
         double v3= 2.24;
         String v4 = "22";
         int v5 =   50000;

         double average=(Integer.valueOf(v1)+v2 +v3 + Integer.valueOf(v4) + v5) /5 ;
         System.out.println(average);



         //to convert string to double
        String v6= "160.95";
        double price= Double.valueOf(v6);
        double quantity=30;
        boolean checkingPrice=price * quantity== 321.9;









    }


}
