package packageday15;

import packagaday7.MathRandom;

import java.util.Random;
import java.util.Scanner;

public class ArrayTask3 {
    public static void main(String[] args) {

        //TODO Task
        // part1. fill array with random values
        // part2. print it in reverse order
        Random rand = new Random();
        int[] arr = new int[10];
        System.out.println("Part1--------------------------");
        // part1
        for (int i = 0; i < arr.length; i++) { ;
            arr[i] = rand.nextInt(10); // 0 - 10
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nPart2--------------------------");
        // part2
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}



