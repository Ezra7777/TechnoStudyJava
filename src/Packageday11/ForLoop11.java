package Packageday11;

public class ForLoop11 {
    public static void main(String[] args) {

        // x and y scope is only
        // within for loop
        int N = 0;
        for (int x = 0; x < 3; x++) {
            System.out.println(x + " ");
            N = x;
        }

        System.out.println("N is :" + N);


    }
}
