package Day20;

import java.util.HashMap;

public class IncrementValue {
    public static void main(String[] args) {






        // Given map, increment map values each time of iteration

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        String sentence = "ABC";

        for (char c : sentence.toCharArray()) {
            System.out.println(map);
            //write you code here


            //end of you code
        }
        //output:
        // {"A"=0}
        // {"A"=1}
        // {"A"=2}
    }
}

