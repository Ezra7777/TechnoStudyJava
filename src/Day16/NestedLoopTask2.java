package Day16;

public class NestedLoopTask2 {

    //using loop print multiplication table of 1
    // part1:
    // 1 x 1 = 1
    // 1 x 2 = 2
    // 1 x 3 = 3
    // 1 x 4 = 4
    // 1 x 5 = 5
    // 1 x 6 = 6
    // 1 x 7 = 7
    // 1 x 8 = 8
    // 1 x 9 = 9
    // 1 x 10 = 10

    // part1.1 continue part1, but use multiplication(*) and 2 variables,
    //  a = 1; b = 1;
    //  result = a * b;
    // print => a + "*" + b + "=" + result;

    //part1.3 print multiplication of table 1,2,3,4,5,6,7,8,9,10
    public static void main(String[] args) {

        //using loop print multiplication table of 1
        // part1:
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10

        // part1.1 continue part1, but use multiplication(*) and 2 variables,
        //  a = 1; b = 1;
        //  result = a * b;
        // print => a + "*" + b + "=" + result;

        //part1.3 print multiplication of table 1,2,3,4,5,6,7,8,9,10

        int a = 3;
        for (int b = 1; b <= 20; b++) {
            System.out.println(a + " x " + b + " = " + (a * b));

        }


    }


}











