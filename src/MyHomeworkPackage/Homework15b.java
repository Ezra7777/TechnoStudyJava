package MyHomeworkPackage;

public class Homework15b {
    public static void main(String[] args) {


            // research on topics "Multi Dimensional Arrays", "Nested Loops"

            // part.1 Given an array of ints, print "has 1" if there is a 1 in the array

            // part 2. Given an array of ints, print "has 1 and 2" if there is a 1 in the array
            //    with a 2 somewhere later in the array.
            // ex1: int[] a= {1,7,4,5,2} => "has 1 and 2"

            // ex2: {1,7,4,5} => "NOTHING HERE"
            // Hint: if you array has 1 and after that somewhere has 2, is should print "has 1 and 2"
            //


        //part1:
        int[] arr = {7, 4, 5, 2, 2};
        boolean arrayHasOne = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                arrayHasOne = true;
            }
        }
        if(arrayHasOne){
            System.out.println("array has 1");
        }

        //part2:
        int []a={1,7,4,5,2};
        boolean arrayHasone=false;
        boolean arrayHastwo=false;
        for( int i=0;i< arr.length;i++ ){
            if(arr[i]==1){
                arrayHasone=true;
            }
            if(arr[i]==2){
                arrayHastwo=true;
            }
        }
         if(arrayHasone){
             System.out.println("array has one");
         }
         if(arrayHastwo){
             System.out.println("array has two");
         }

         //part3:

        int[ ] a1={9,4,2,1,8,5};
        boolean arrayHasOneq = false;
        boolean arrayHasTwo = false;
        boolean arrayHasOneAndTwo = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arrayHasOne = true;
            }
            if (arr[i] == 2) {
                arrayHasTwo = true;
            }
        }
        if (arrayHasOneq) {
            System.out.println("array has 1");
        }
        if (arrayHasTwo) {
            System.out.println("array has 2");
        }
        arrayHasOneAndTwo = arrayHasOne && arrayHasTwo;
        if (arrayHasOneAndTwo) {
            System.out.println("array has 1 nad 2");
        }

    }

    }

