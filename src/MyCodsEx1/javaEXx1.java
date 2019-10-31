package MyCodsEx1;

public class javaEXx1 {
    public static void sum(int a, int b, int c) {
        System.out.println("sum: " + (a + b + c));
    }

    public static void sum(int a, int b) {
        System.out.println("sum: " + (a + b));
    }

    public static void sum(int a, int b, int c, int d) {
        System.out.println("sum:" + (a + b + c + d));
    }
        public static void main(String[]args){

            sum(3, 4, 5);
            sum(10, 20);
            sum(10, 20, 30, 40);
        }
    }

