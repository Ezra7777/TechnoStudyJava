package Day27;

public class Task3 {
    //3. Write a Java program to print the grid of zeros with length m and n.
    public static void main(String[] args) {
        int m = 2;
        int n = 3;

        // create a 2D array
        int[][] array = new int[m][n];
//        for (int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length;j++){
//                System.out.print(array[i][j]);
//            }
//            System.out.println();
//        }

        for (int row = 0; row < m; row++){
            for(int col = 0; col < n;col++){
                System.out.print(array[row][col]);
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

