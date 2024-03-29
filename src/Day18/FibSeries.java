package Day18;

public class FibSeries {
    public static void main(String[] args) {




            //    Fibonacci Number
//    The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//
//    F(0) = 0,   F(1) = 1
//    F(N) = F(N - 1) + F(N - 2), for N > 1.
//    Given N, calculate F(N).
//
//
//
//    Example 1:
//
//    Input: 2
//    Output: 1
//    Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
//    Example 2:
//  1, 1, 2, 3, 5, 8
//    Input: 3
//    Output: 2
//    Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
//    Example 3:
//
//    Input: 4
//    Output: 3
//    Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

                int result = fib(5);
            }
            //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
            static int fib(int N) {
                int first = 1;
                int second = 1;
                int fibNum;

                for (int i = 0; i < N; i++) {
                    fibNum = first + second;
                    first = second;
                    second = fibNum;
                    System.out.println(fibNum);
                }
                return -1;
            }
        }


