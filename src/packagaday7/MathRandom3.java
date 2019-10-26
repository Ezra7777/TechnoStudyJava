package packagaday7;

public class MathRandom3 {
     //printing number in range

    public static void main(String[] args) {

        int min = -30;
        int max = 40;
        int range = max - min ;
        int randomInRange = min + (int ) (Math. random () *  (range + 1 ));

        int temperature= randomInRange;
        System.out.println(" Temperature is :" + temperature);

        if ( temperature ==40) {
            System.out.println("Frying");
        }
         if ( temperature >=27 ) {
             System.out.println(" It is hot");
         }

         if (temperature <20 && temperature >=10 ){

             System.out.println( " Cool");


             if ( temperature <10) {
                 System.out.println("Freezing");

             }










        }

        }

}








