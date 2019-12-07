package Day20;

import java.util.HashMap;

public class PutValue2 {



    // Put Strings into map as keys, and print you map
    public static void main(String[] args) {

        String[] names = {"Max", "Drake", "Susan"};
        HashMap<String, Integer> map = new HashMap<>();
        for(String a:names){
            map.put(a,0);
        }
        System.out.println(map);
        //end of you code
//        System.out.println(map);
        //output:
        //{"Max"=0,"Drake"=0,"Susan"=0}
    }
        }



