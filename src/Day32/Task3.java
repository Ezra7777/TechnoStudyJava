package Day32;

import java.util.ArrayList;

public class Task3 {

        // Write a program with a method named printAverage
        // that accepts ArrayList of integers as an argument and print its average.

            public static void printAverage(ArrayList<Integer> list) {
                int sum = 0;
                for (Integer number : list) {
                    sum += number;
                }

                double avg = (double) sum / list.size();
                System.out.println("Average is:" + avg);
            }

            public static void main(String[] args) {
                ArrayList<Integer> myList = new ArrayList<>();
                myList.add(1);
                myList.add(5);
                myList.add(9);

                printAverage(myList);
            }

        }








