package Day26_Exeptions;

public class Exception3 {
    public static void main(String[] args) {
       // finally means work any conditions
        //array of size 4.
        //stack trace means where it comes from that package
        // array of size 4.
        int[] arr = new int[4];

        // this statement causes an exception
        int i = arr[4];

        // the following statement will never execute
        System.out.println("Hi, I want to execute");
    }


    }

