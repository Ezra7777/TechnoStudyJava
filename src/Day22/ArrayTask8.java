package Day22;

import java.util.ArrayList;

public class ArrayTask8 {
    private static Object EvenSum;

    public static <integer> void main(String[] args) {

        // Write a java program which will
        // add only even numbers to list from array of integers
        // {100,2,4,5,6,7,8,9,10}
        // [2,4,6,8,10]

        // hint: num%2==0 => this is even

        // Write a java program which will
        // add only even numbers to list from array of integers
        // {100,2,4,5,6,7,8,9,10}
        // [2,4,6,8,10]
        // hint: num%2==0 => this is even

            int[] intArray = {100, 2, 4, 5, 6, 7, 8, 9, 10};

            ArrayList<Integer> intList = new ArrayList<>();
            for (int num : intArray) {
                if (num % 2 == 0) {
                    intList.add(num);
                }
            }
            System.out.println(intList);
        }
    }
