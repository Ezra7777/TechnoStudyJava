package Day22;

public class ArrayTask3 {
    public static void main(String[] args) {

//    Write a Java program to print the grid of zeros with length m and n.


            int m = 2;// colum
            int n = 3; //row

        //create a 2D array
        // create a 2D array
        int[][] array = new int[m][n];
//        for (int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length;j++){
//                System.out.print(array[i][j]);
//            }
//            System.out.println();
//        }

        for (int i = 0; i < m; i++){
            for(int j = 0; j < n;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        //Hint: user nested loop to print zeros
//        output, ex1: m=2, n=2;
//        0 0
//        0 0

//        output, ex2: m=2, n=3;
//        0 0 0
//        0 0 0
    }
}















