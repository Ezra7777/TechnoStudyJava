package Day7;
      // To get random number between 0 and N ,multiply Math.random() with N
      // FORMULA: Math.random ( ) * N, where is integer
public class MathRandom2 {

    //task2: print 2 random numbers between 0 and 10;
    //ex:1
    //    4
    //    5
    //ex.2
    //  1
    //  2
    public static void main(String[] args) {
        // 1.way
      //  System.out.println(int)(Math.random() * 10));
       // System.out.println(int)(Math.random ()* 10));

         // 2.way
        int max= 10;


        double r1=Math.random () * max;
        int i1 = (int) r1;// gets integer from double
        System.out.println(r1);


        double r2=Math.random() * max;
        int i2 =(int) r2 ; //gets integer from double
        System.out.println(i2);














    }








}

