package Day17;

public class MultiDimensionalTask5 {
    public static void main(String[] args) {


//part3, you have to USE 2 LOOP and print
        // red apple
        // green lemon
        // blue peach

        String[][] fruits = {

                {"red", "apple"},
                {"green","lemon"},
                {"blue","peach"},
        };

        for (int a = 0; a < fruits.length; a++) {
            for (int b = 0; b < fruits[a].length; b++) {
                System.out.print(fruits[a][b]+ " ");
            }
            System.out.println();
        }

    }

}

