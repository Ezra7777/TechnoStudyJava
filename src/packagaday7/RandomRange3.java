package packagaday7;



public class RandomRange3 {

    public static void main(String[] args) {

        int min = 10;
        int max = 20;
        int range = max - min;
        int randomInrange = min + (int) (Math.random() * (range + 1));
        System.out.println(randomInrange);

        if (randomInrange == 1) {
            System.out.println("one");

        }

        //1.write a program that prints word representation of your number
        // where number is 0 < = N <= 3
        // ex: 0 = > zero
        // ex: 3 = > three


        int N = 0;
        int max1 = 3;
        int Range = max - min;
        int randomInRange = min + (int) (Math.random() * (range + 1));

        System.out.println(randomInRange);

        if (randomInRange == 0) {
            System.out.println("zero");
        }
        if (randomInRange == 1) {
            System.out.println("one");
        }
        if (randomInRange == 2) {

        }
        System.out.println("two");
        if (randomInRange == 3) {
            System.out.println("three");


        }
    }
}
