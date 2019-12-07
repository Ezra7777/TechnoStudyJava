package Day22;

public class ArrayTask10 {
    public static void main(String[] args) {

        //write a java program that iterates in reverse order on
        // an array using while-loop

        int[] intArray = {100, 2, 4, 5, 6, 7, 8, 9, 10};

        int i=intArray.length-1;
        while(i>=0) {
            System.out.println(intArray[i] + " ");
            i--;

            // ex. output:
            // 10 9 8 7 6 5 4 2 100

        }

        }

    }

