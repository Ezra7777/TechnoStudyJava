package day20;

import java.util.HashMap;

public class PutValue3 {

    // Put first names and last names into your map, and print
    public static void main(String[] args) {

        String[] firstNames = {"Max", "Drake", "Susan"};
        String[] lastNames = {"Smith", "Jones", "Miller"};

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < firstNames.length; i++) {
            map.put(firstNames[i],lastNames[i]);
        }
            System.out.println(map);
            //System.out.println(map);
            //output:
            //{"Max"="Smith","Drake"="Jones","Susan"="Miller"}
        }
    }




