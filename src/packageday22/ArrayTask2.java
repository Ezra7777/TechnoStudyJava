package packageday22;

import java.util.Arrays;

public class ArrayTask2 {
    public static void main(String[] args) {


        // 2. Write a Java program to sum values of an array.

        int[] array = {10, 10, 10};
        //1.way.  for
        int sum1 = 0;
        for (int number : array) {
//            sum1 = sum1 + number;
            sum1 += number;
        }
        System.out.println(sum1);
        //2.way.  fori -> using for(int i = 0)
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            sum2 += number;
        }






        //3.way.  for -> using for(int i = array.length-1), from reverse
        int sum3 = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            int number = array[i];
            sum3 += number;
        }
        System.out.println(sum3);

        if (sum1 == sum2 && sum1 == sum3) {
            System.out.println("they are equal");

        }




    }




}

