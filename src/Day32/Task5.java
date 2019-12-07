package Day32;

import java.util.ArrayList;

public class Task5 {
    // Write a boolean method called isOdd,
    //    which takes an int as input and returns true if the it is odd.


    public static void main(String[] args) {


        int mynumber = 0;
        System.out.println();
    }

    public static boolean isEven(int x) {
        if ((x & 1) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}