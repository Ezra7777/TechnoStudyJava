package Day20;

import java.util.HashMap;

public class PutValue {



// Given map, put chars into map
        public static <integer> void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            String sentence = "ABC";
            char[] chars = sentence.toCharArray();//sentence.toCharArray() => ['A', 'B',' C']
            for (char c : chars) {
                //write you code here

                //end of you code
                System.out.print(map);
            }
            //output:
            // {"A"=0}
            // {"B"=0}
            // {"C"=0}
        }



    }

