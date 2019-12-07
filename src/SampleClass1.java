import java.util.Scanner;

public class SampleClass1 {
    public static void main(String[] args) {
        String[] names = {"Virginia", "Tom", "Edgar"};
        // for arrays, we use for loop
        System.out.println("Array: ");
        for (String x : names) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println();

        // 2D Array / Multi Dimensional Array
        String[][] namesAndLastNames = {{"Virginia", "Tom", "Edgar"}, {"Woolf", "Sawyer", "Poe"}};
        // for 2d arrays we use nested loops:
        System.out.println("2D Array: ");
        for (int i = 0; i <= namesAndLastNames.length; i++) {
            for (int j = 0; j <= namesAndLastNames.length - 1; j++) {
                System.out.print(namesAndLastNames[j][i] + " ");
            }
            System.out.println();
        }
    }
}