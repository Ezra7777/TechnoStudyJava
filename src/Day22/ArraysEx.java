package Day22;

import java.util.Arrays;

public class ArraysEx {
    public static <list> void main(String[] args) {

        //Write a Java program to sort a numeric array and a string array.




            //Write a Java program to sort a numeric array and a string array.

                int[] numbers = {1, 2, 4, 10, 2, 0};
                String[] names = {"Zeynep", "Serkan", "Bayram"};

                System.out.println("First Numeric array : "+Arrays.toString(numbers));
                Arrays.sort(numbers);
                System.out.println("Sorted Numeric array : "+Arrays.toString(numbers));


                System.out.println("First String array : "+Arrays.toString(names));
                Arrays.sort(names);
                System.out.println("Sorted String array : "+ Arrays.toString(names));
            }
        }



