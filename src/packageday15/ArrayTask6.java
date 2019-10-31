package packageday15;

public class ArrayTask6 {
    public static void main(String[] args) {

            //HINT:
            //create two arrays, fill it with numbers
            //check numbers at index 0
            //         0   1   2   3   4   5
            int[] a = {10, 20, 25, 60, 50, 30}; // length = 6
            //          0   1   2
            int[] b = {10, 60, 30}; //length = 3 => 3-1 =>2
            //part 1
            System.out.println("Part1------------------------");
            if (a[0] == b[0]) {
                System.out.println("have the same first elements");
            }
            //part 2
            System.out.println("Part2------------------------");
            int lengthOfA = a.length; //6-1 =>5
            int lengthOfB = b.length; //3
            if (a[lengthOfA - 1] == b[lengthOfB - 1]) {
                System.out.println("have the same last elements");
            }
            //part 3
            System.out.println("Part3------------------------");
            if (a[lengthOfA / 2] == b[lengthOfB / 2]) {
                System.out.println("have the same middle elements");
            }

        }
    }


