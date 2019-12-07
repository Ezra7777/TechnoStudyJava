package Day14;

public class FindMinNumber {
    public static void main(String[] args) {


        int[] myArray = {2, 11, 45, 9, 56};
        // 0   1   2   3  4
        int min = myArray[2];

        for (int i = 0; i < myArray.length; i++) {
            int value = myArray[i];

            if (myArray[i] < min) {
                min = myArray[i];


            }


        }
         System.out.println(min);   
    }

}

