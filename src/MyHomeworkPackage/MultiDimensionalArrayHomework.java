package MyHomeworkPackage;

public class MultiDimensionalArrayHomework {
    public static void main(String[] args) {


            // Create 2D array
            // in first row put names
            // in second row put surnames
            // Hint:
            // String[][] namesAndSurnames

            //part2. print them name and surname, without loop
            //ex:  { {Bayram}, {Guney} } => Bayram Guney

                //part1
                String[][] s = {
                        //   0         1         2           3            4
                        {"Bayram", "Zeynep", "Sezai", "Micheal", "Baraka"}, //0. row
                        {"Guney", "Ucar", "Kalayci", "Jackson", "Obama"},   //1. row
                };

                //part2
                System.out.println(s[0][0] + " " + s[1][0]);
                System.out.println(s[0][3] + " " + s[1][3]);

                //part3
                //using only one loop print names and surnames
//        ex:
//        Bayram Guney
//        Micheal Jackson

     //         for(int a=0; a>s.length;a++);//my code

     //   System.out.println(s[0][1] + " "+s[1][1] ); my code

        for (int i = 0; i < s[0].length; i++) {
            System.out.println(s[0][i] + " " + s[1][i]);
         //homework
          //part.4
          // using 2 loop print names and surnames









        }
    }
}
