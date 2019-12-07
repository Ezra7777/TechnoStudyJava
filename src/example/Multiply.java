package example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Multiply {

    //create class Multiplier
    //create method which multiply 2 integers
    //create method which multiply 3 integers
    //create method which multiply a list of integers
    //create method which multiply 2 double
    //and test them using junit


    static int Multiply(int a, int b) {
        return a + b;
    }

    static int Multiply(int a, int b, int c) {
        return a + b + c;
    }

    static double Multiply(double a, double b) {
        return a + b;
    }

    static int Multiply(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static int Multiply(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    @Test
    public void multiplyTwoIntegers() {
        int actual = Multiply(2, 2);
        int expected = 4;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyThreeIntegers() {
        int actual = Multiply(2, 2, 2);
        int expected = 8;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyListIntegers() {
        int actual = Multiply(Arrays.asList(1, 2, 3));
        int expected = 6;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTwoDoubles() {
        double actual = Multiply(2.0, 2.0);
        double expected = 4.0;


        Assert.assertEquals(expected, actual, 1);
    }

}








