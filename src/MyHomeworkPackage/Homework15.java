package MyHomeworkPackage;

public class Homework15 {
    public static void main(String[] args) {
        //TODO
        // research on topics "Multi Dimensional Arrays", "Nested Loops"
        // Task
        // 1. Return the number of even ints in the given array.
        // {1,2,3,4,5,6} => 3
        // Hint: you need to count "even numbers"
        // 2. Given an array of ints, print "has 1 and 2" if there is a 1 in the array
        //    with a 2 somewhere later in the array.
        // ex1: {1,7,4,5,2} => "has 1 and 2"
        // ex2: {1,7,4,5} => "NOTHING HERE"
        // Hint: if you array has 1 and after that somewhere has 2, is should print "has 1 and 2"


                String[] strArray = new String[15];
                for (int i = 0; i < strArray.length; i++) {
                    strArray[i] = "" + i;
                    // stringNumbers[0] = "0"
                    // stringNumbers[1] = "1"
                    // ...
                    // stringNumbers[14] = "14"
                }
                String stringSum = "";
                for (String a : strArray) {
                    stringSum += a;
                }
                System.out.println("StringConcatenate: " + stringSum);

                int[] intArray = new int[15];
                for (int i = 0; i < intArray.length; i++) {
                    intArray[i] = Integer.valueOf(strArray[i]);
                }

                int intSum = 0;
                for (int n : intArray) {
                    intSum += n;
                }
                System.out.println("IntSum: " + intSum);

            }
        }

