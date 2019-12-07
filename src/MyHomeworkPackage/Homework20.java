package MyHomeworkPackage;

import java.util.HashMap;
import java.util.Map;

public class Homework20 {
    public static void main(String[] args) {
        //       Given two strings s and t ,
        //      write a java program to determine if t is an anagram of s.
        //      Example 1:
        //      a:3
        //      n:1
        //      g:1
        //      r:1
        //      m:1
        //      Input: s = "anagram", t = "nagaram"
        //      Output: true
        //      Example 2:
        //     Input: s = "rat", t = "car"
        //     Output: false
        //     Note:
        //     You may assume the string contains only lowercase alphabets.


// approach
//public class AnagramSample  {
//   public static void main(String args[]) {
//      String str1 = "anagram";
//      String str2 = "nagaram";
//
//      if (str1.length()==str2.length()) {
//         char[] arr1 = str1.toCharArray();
//         Arrays.sort(arr1);
//         System.out.println(Arrays.toString(arr1));
//         char[] arr2 = str2.toCharArray();
//         Arrays.sort(arr2);
//         System.out.println(Arrays.toString(arr2));
//         System.out.println(Arrays.equals(arr1, arr2));
//         if(arr1.equals(arr2)) {
//            System.out.println("Given strings are anagrams");
//         } else {
//            System.out.println("Given strings are not anagrams");
//         }
//      }
//   }
//}
        //    Modify and print the given map as follows:
//    for this problem the map may or may not contain the "a" and "b" keys.
//    If both keys are present, append their 2 string values together
//    and store the result under the key "ab".
//
//    {"a": "Hi", "b": "There"} → {"a": "Hi", "ab": "HiThere", "b": "There"}
//    {"a": "Hi"} → {"a": "Hi"}
//    {"b": "There"} → {"b": "There"}

        ////////
        //    Given an array of non-empty strings,
//    create and return a Map<String, String> as follows:
//    for each string add its first character as a key with
//    its last character as the value.

//    ["code", "bug"] → {"b": "g", "c": "e"}
//    ["man", "moon", "main"] → {"m": "n"}
//    ["man", "moon", "good", "night"] → {"g": "d", "m": "n", "n": "t"}


        ///////////
        // Modify and print the given map as follows:
        // if the key "a" has a value, set the key "b" to have that value,
        // and set the key "a" to have the value ""

        //{"a": "candy", "b": "dirt"} => "a": "", "b": "candy"
        //{"a": "candy"} => "a": "", "b": "candy"
        //{"a": "candy", "b": "carrot", "c": "meh"} => {"a": "", "b": "candy", "c": "meh"}


    }
}


