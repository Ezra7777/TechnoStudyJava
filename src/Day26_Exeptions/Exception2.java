package Day26_Exeptions;

public class Exception2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;


        try {
            int result = computeDivision(x, y);
        }
        // matching ArithmeticException
        catch (ArithmeticException ex) {
            // getMessage will print description of exception(here / by zero)
            System.out.println(ex.getMessage());
        }
    }

    private static int computeDivision(int x, int y) {
        int result = x / y;
        return result;
    }
}           //catch everything the error
           //stack trace means where it comes from that package shows us step by step