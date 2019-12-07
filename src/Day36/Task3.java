package Day36;

public class Task3 {
    public static void main(String[] args) {

    }

    public static Integer covertToInt(String number) {

        try {
            System.out.println(covertToInt("one"));

        } catch (Exception ex) {
            System.out.println(covertToInt("2"));
        } finally {
            System.out.println(covertToInt("-1"));
        } return Integer.valueOf(number);
    }
}


