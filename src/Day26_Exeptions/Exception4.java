package Day26_Exeptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//fileNotFoundException
public class Exception4 {
    public static void main(String[] args) throws FileNotFoundException {


        try {    //catch any cases
            File file = new File("D:\\SomeFolder\\file.txt");

            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found;");
            System.out.println(ex.getStackTrace());//catch this code
        }
    }
}