package packageday22;

import packageday18.ArrayTest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayTask5 {
    public static void main(String[] args) {
        List<Integer> all = new ArrayList<>();
        all.add(20);
        all.add(30);
        all.add(40);
        all.add(1);
        all.add(2);

        all.remove(1);

        all.remove(2);

        System.out.println( all);
    }
}



