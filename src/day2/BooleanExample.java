package day2;

public class BooleanExample {
    public static void main(String[] args) { boolean bool = true;






        boolean falseBool = false;
        boolean trueBool = true;


        System.out.println(trueBool || trueBool);
        System.out.println(falseBool || trueBool);
        System.out.println(trueBool || falseBool);
        System.out.println(falseBool || falseBool);





        // 1. write program which will test this:
        // a.true && true =>  true
      //  System.out.println(trueBool && trueBool);
        // b. false && true => false
      //  System.out.println(falseBool && trueBool);

       // System.out.println(trueBool && falseBool);
        // System.out.println(falseBool && falseBool);






        // 2. write program which will test this/
        //  a. true  \\  true => ?
        //  b.false \\ true => ?
        //  c. true \\ false => ?
        //  d. false \\ false =>? ||





        System.out.println("trueBool || trueBool => " + ( trueBool || trueBool )) ;
        System.out.println( "falseBool || trueBool => " +( falseBool || trueBool )) ;
        System.out.println( "trueBool || falseBool => " +( trueBool || falseBool )) ;
        System.out.println( "falseBool || falseBool => " +( falseBool || falseBool )) ;


    }


/// & it means and
///  || it means or





}



