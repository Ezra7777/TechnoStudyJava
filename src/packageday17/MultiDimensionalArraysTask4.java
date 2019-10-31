package packageday17;



public class MultiDimensionalArraysTask4 {
    private static String Jackson;

    public static void main(String[] args) {
        //part4, as homework
        //USING TWO LOOP print names and surnames
        //ex:
        //Bayram Guney
        //Micheal Jackson

        String[][] nameandsurname = {
                {"Bayram", "Guney",},
                {"Michael", "Jackson"}
        };
        for (int i = 0; i < nameandsurname[1].length; i++) {
            for (int j = 0; j < nameandsurname[1].length; j++) {
                System.out.print(nameandsurname[i][j] + " ");
            }
            System.out.println();
        }
    }
}