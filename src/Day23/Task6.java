package Day23;

public class Task6 {
    public static void main(String[] args) {

        // Given an array of ints,
        // print true if it contains no 1's or it contains no 4's.
        // {1, 2, 3} => true
        // {2, 3, 4} => true
        // {1, 2, 4} => false
        //Hint: use boolean variable to hold state

        int[] numbers = {1, 2, 4};
        boolean haveOne = false;
        boolean haveFour = false;

        for (int number : numbers) {
            if (number == 1) {
                haveOne = true;
            } else if (number == 4) {
                haveFour = true;
            }
        }

        if (haveOne && haveFour) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}