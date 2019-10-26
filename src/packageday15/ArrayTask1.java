package packageday15;

import packagaday7.MathRandom;

import java.util.Random;

public class ArrayTask1 {
    public static void main(String[] args) {

            //TODO Task
            // part1. fill array with random values using Random/Math.random,
            //        10 < array.length < 100
            // part2. find average of array;
        //  ex: [1, 5, 6, 8] => 20/4 => 5


        Random rand=new Random();
        int [ ] arr=new int [100];
        for(int i=10;i< arr.length;i++){
        arr[i]=(int)(Math.random()*100);
            System.out.println(arr[i]);

        }

        // some changes
    }




    }

