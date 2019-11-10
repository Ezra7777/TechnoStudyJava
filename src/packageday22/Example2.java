package packageday22;

public class Example2 {
    public static void main(String[] args) {
        String s1 = "Hello";

//        char[] charArray = new char[s1.length()];
//        charArray[0] = 'H';
//        charArray[1] = 'e';
//        charArray[2] = 'l';
//        charArray[3] = 'l';
//        charArray[4] = '0';
        char[] charArray = s1.toCharArray();
        charArray[0] = 'A';
        System.out.println(charArray);


        String f1 = "Hello my World in my space";
        String[] array = s1.split(" ");

        boolean[] b1 = new boolean[100];
        for (boolean currentValue : b1) {
            currentValue = b1[0]; // it. 1
            currentValue = b1[1]; // it. 2
            currentValue = b1[2]; // it. 3
            ///
        }
    }
}
