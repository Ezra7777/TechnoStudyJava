package Day20;

import java.util.HashMap;

public class CheckBeforeValue {


    // put only 'h' letter as keys into your HashMap,
    // put value = 0
    public static void main(String[] args) {
        String sentence = "johny hello";

        HashMap<Character, Integer>letterMap = new HashMap<>();

        char[] sentenceArray = sentence.toCharArray();
        for (char letter : sentenceArray) {
            if(letter=='h') {
                letterMap.put(letter, 0);
            }
        }
        System.out.println(letterMap);
        // {h=0}
    }
}

