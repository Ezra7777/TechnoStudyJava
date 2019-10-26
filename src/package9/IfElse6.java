package package9;

import java.util.Scanner;

public class IfElse6 {
    public static void main(String[] args) {
        //evaluate result of exam
        // 'A '=.
        // 'B'=> GOOD
        //'C'=> MIDDLE
        //'D' => PASS
        // "F'=> FAIL

       //todo Hint: next line,String,equals,equalsIgnoreCase
        Scanner scan= new Scanner (System.in);
        System.out.println( "Provide a grade: [A,B,C,D,F");
        String grade=scan.nextLine( );
         if (grade.equals("A")){
             System.out.println("excellent");
         }else  if("B".equals(grade)) {
             System.out.println("good");
         }else if (grade.equals ("C")){
             System.out.println("middle" );
        }else if (grade.equals ("D")){
             System.out.println("pass" );
         }else if (grade.equals( "F")){
             System.out.println("Fail");
         }else{
             System.out.println("invalid grade");
         }








        //task2:
        // continue task 1 but also check for B+,B-,C+,C-,D+,D-
        //EX:
        //B+ OR B OR B-=> GOOD
        //C+ OR C OR C-=> MIDDLE
        //D+ OR D OR D- =>PASS
        //Todo Hint: in Java logical operator for OR is ||,two vertical lines
        //





          }

            }



















