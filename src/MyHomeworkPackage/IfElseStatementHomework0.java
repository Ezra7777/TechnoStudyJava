package MyHomeworkPackage;


import java.util.Scanner;

public class IfElseStatementHomework0 {
    public static void main(String[] args) {


        //Write a statement program determines a student's grade?
        //the program will read three types of scores (quiz,mid-term,and final score and determine the grade based on the fallowing rules:
        //-if the average score >=90 %=>grade A
        //-if the average score >=70% and <90%=> grade =B
        //-if the average score >=70%and <90%=>grade=C
        //-IF THE AVERAGE SCORE >=50% and <70 => grade =C
        //- if the average score <50%=>grade=F
        //
        //Quiz score:80
        //
        //Mid-term score: 68
        //
        //Final score:90
        //
        //Your grade is B.


        Scanner scan= new Scanner(System.in);
        int average =scan.nextInt( );

        if (average ==90 ){
            System.out.println("Final Score " );
        } else if (average >= 70 && average <90){
             System.out.println( "Your Grade is B");
         } else if (average >50 && average <70) {
            System.out.println("MID-TERM Score");
        }else if (average > 70 && average <90 ){
            System.out.println("Quiz Score");
        }

    }




}
