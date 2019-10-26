package packagaday6;

public class ComparingString {
    public static void main(String[] args) {

        String s1= "Yes" ;
        String s2= "Yes";

        if ( s1== s2){
            System.out.println();

            if (s1==s2);{
                System.out.println( "it's equal");
            }

               String s3=new String( "YES");
               String s4= new String( "YES");


               if (s3.equals(s4) ) {
                   System.out.println(  "it's equal again");
               }

                String name ="Ali";
                if ( name.equals( "MAX ")) {
                    System.out.println( "Hello");
                }
                 String nameOfCourse ="TS";
                 String otherString="TS";
                 if (nameOfCourse.equals(otherString )) { //"TS" is equal to "TS"
                     System.out.println("You gonna be Tester after 6 months");
                 }

                 //Task1:
                 // check if string is equals to your name .print your surname
                 //ex;Michale =>Jackson

                  String name2="Michale";
                  String surname= "Jackson";


                  if (name2.equals("Michale")) {
                      System.out.println(surname);
                  }

                  int number =10;
                  if (number ==10) {
                      System.out.println("It's ten");
                  }

               //summary
               // in String USE .equals
               // in mumber (int,double,etc...) use==
               //to check equaly










        }





    }










}


