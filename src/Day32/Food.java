package Day32;

public class Food {

    public String name = "Sphagetti";
    public boolean mostpopularfood = true;
    public int preparationtime = 30;
    public int calorie = 110;
    public int ingriediest = 5;
    public boolean nutritionfacts = false;

    public boolean Delicious() {
        if (ingriediest >= 10 || preparationtime >= 30) {
            return true;
        } else
            return false;
    }

    public String EasyQook() {
        if (mostpopularfood == true && ingriediest <= 6 && preparationtime <= 30) {
            return "";
        } else if (mostpopularfood == true && ingriediest <= 6 && preparationtime <= 30) {
            return "Easy Qook";
        } else if (mostpopularfood == true && ingriediest <= 15 && preparationtime <= 90) {
            return "it takes time to qook";
        } else
            return "Let's  qook another food";
    }

}
