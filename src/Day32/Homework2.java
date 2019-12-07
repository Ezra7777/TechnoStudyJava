package Day32;

public class Homework2 {
    public static void main(String[] args) {


        Food f = new Food();
        f.name = "Sphagetti";
        f.mostpopularfood= true;
        f. preparationtime = 40;
        f.calorie = 110;
        f. ingriediest = 5;
        f. nutritionfacts = true;


        System.out.println("is it easy to qook  : " + f.Delicious());
        System.out.println(f.EasyQook());
    }
}
