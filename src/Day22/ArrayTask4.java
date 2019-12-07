package Day22;

public class ArrayTask4 {
    public static void main(String[] args) {


        // 4. Write a Java program to test if an array contains a specific value

        int[] num = {2,4,6,8,10};
        int Find = 2;
        boolean found = false;
        for (int n : num) {
            if (n == Find) {
                found = true;

            }
        }
        if(found)
            System.out.println(Find + " is found.");
        else
            System.out.println(Find + " is not found.");
    }

}