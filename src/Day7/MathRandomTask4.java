package Day7;

public class MathRandomTask4 {

    public static void main(String[] args) {

        ////1.write a program that sums 2 random integer numbers,
        // and print sum.



        int a=(int) ( Math.random () * 123 ); // 0-10 gets integer form double
        int b = (int) ( Math.random () * 333 ); //0-100 gets integer from double
        System.out.println(a);
        System.out.println(b);
        System.out.println( a+b);

         int a1 = 10;
         int b1 =  20;
         int range1 = b1-a1;
         int random = range1 + (int)( Math.random());
        System.out.println(random );













    }






}
