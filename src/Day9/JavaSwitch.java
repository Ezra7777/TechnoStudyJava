package Day9;



public class JavaSwitch {


    public static void main(String[] args) {

        String grade= "A";
        switch (grade) {
            case"A+":
            case"A-":
            case"A" :
                System.out.println("excellent");
                break;
            case "B+":
            case "B-":
            case "B":
                System.out.println( "good");
                break;
            case "C+":
            case "C" :
            case "C-":
                System.out.println("pass" );

            case "D+":
            case "D":
            case"D-":
                System.out.println("fail" );




        }

    }






}
