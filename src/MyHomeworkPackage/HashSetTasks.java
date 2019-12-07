package MyHomeworkPackage;

        public class HashSetTasks {
//    https://beginnersbook.com/2013/12/hashset-class-in-java-with-example/

//1. Write a Java program to append the specified element to the end of a hash set.
//
// public static void main(String[] args) {
//
//     HashSet<String> h_set = new HashSet<String>();
//
//          h_set.add("Red");
//          h_set.add("Green");
//          h_set.add("Black");
//          h_set.add("White");
//          h_set.add("Pink");
//          h_set.add("Yellow");
//
//
//   System.out.println("The Hash Set: " + h_set);
//   }
//}
//2. Write a Java program to iterate through all elements in a hash list.
//
//public static void main(String[] args) {
//
//     HashSet<String> hset = new HashSet<String>();
//
//
//     hset.add("Chaitanya");
//     hset.add("Rahul");
//     hset.add("Tim");
//     hset.add("Rick");
//     hset.add("Harry");
//
//     Iterator<String> it = hset.iterator();
//     while(it.hasNext()){
//        System.out.println(it.next());
//     }
//  }
//}
//3. Write a Java program to get the number of elements in a hash set.
//
// public static void main(String args[]) {
//
//      HashSet<String> hset =
//               new HashSet<String>();
//
//
//      hset.add("Apple");
//      hset.add("Mango");
//      hset.add("Grapes");
//      hset.add("Orange");
//      hset.add("Fig");
//
//      hset.add("Apple");
//      hset.add("Mango");
//      //Addition of null values
//      hset.add(null);
//      hset.add(null);
//
//
//      System.out.println(hset);
//    }
//}
//4. Write a Java program to empty an hash set.
//public static void main(String args[]) {
//
//
//      HashSet <String> newset = new HashSet <String>();
//
//
//      newset.add("Learning");
//      newset.add("Easy");
//      newset.add("Simply");
//
//
//      System.out.println("Hash set values: "+ newset);
//
//
//      newset.clear();
//
//      System.out.println("Hash set values after clear: "+ newset);
//   }
//}
//
//5. Write a Java program to test a hash set is empty or not.
//public static void main(String args[]) {


 //       HashSet <String> newset = new HashSet <String>();
 //       newset.add("Learning");
 //       newset.add("Easy");
 //       newset.add("Simply");
 //       boolean isempty = newset.isEmpty();

 //       System.out.println("Is the hash set empty: "+ isempty);
//}
 //       }
//
//
//6. Write a Java program to clone a hash set to another hash set.
//public static void main(String args[]) {
//
//      // create two hash sets
//      HashSet <String> newset = new HashSet <String>();
//      HashSet <String> cloneset = new HashSet <String>();
//
//      // populate hash set
//      newset.add("Learning");
//      newset.add("Easy");
//      newset.add("Simply");
//
//      // clone the hash set
//      cloneset = (HashSet)newset.clone();
//
//      System.out.println("Hash set values: "+ newset);
//      System.out.println("Clone Hash set values: "+ cloneset);
//   }
//}
//
//7. Write a Java program to convert a hash set to an array.
//public static void main(String[] args) {
//
//     HashSet<String> hset = new HashSet<String>();
//
//
//     hset.add("Element1");
//     hset.add("Element2");
//     hset.add("Element3");
//     hset.add("Element4");
//
//
//     System.out.println("HashSet contains: "+ hset);
//
//
//     String[] array = new String[hset.size()];
//     hset.toArray(array);
//
//
//     System.out.println("Array elements: ");
//     for(String temp : array){
//        System.out.println(temp);
//     }
//  }
//}
//
//8. Write a Java program to convert a hash set to a tree set.
// public static void main(String[] args) {
//     // Create a HashSet
//     HashSet<String> hset = new HashSet<String>();
//
//     //add elements to HashSet
//     hset.add("Element1");
//     hset.add("Element2");
//     hset.add("Element3");
//     hset.add("Element4");
//
//     // Displaying HashSet elements
//     System.out.println("HashSet contains: "+ hset);
//
//     // Creating a TreeSet of HashSet elements
//     Set<String> tset = new TreeSet<String>(hset);
//
//     // Displaying TreeSet elements
//     System.out.println("TreeSet contains: ");
//     for(String temp : tset){
//        System.out.println(temp);
//     }
//  }
//}
//
//9. Write a Java program to convert a hash set to a List/ArrayList.
//
//public static void main(String[] args) {
//     // Create a HashSet
//     HashSet<String> hset = new HashSet<String>();
//
//     //add elements to HashSet
//     hset.add("Laila");
//     hset.add("Sam");
//     hset.add("Olivia");
//     hset.add("Drew");
//     hset.add("Will");
//
//     // Displaying HashSet elements
//     System.out.println("HashSet contains: "+ hset);
//
//     // Creating a List of HashSet elements
//     List<String> list = new ArrayList<String>(hset);
//
//     // Displaying ArrayList elements
//     System.out.println("ArrayList contains: "+ list);
//  }
//}
//10. Write a Java program to compare two hash set.
// public static void main(String[] args) {
//
//        HashSet<String> h_set = new HashSet<String>();
//
//          h_set.add("Red");
//          h_set.add("Green");
//          h_set.add("Black");
//          h_set.add("White");
//
//          HashSet<String>h_set2 = new HashSet<String>();
//          h_set2.add("Red");
//          h_set2.add("Pink");
//          h_set2.add("Black");
//          h_set2.add("Orange");
//
//          HashSet<String>result_set = new HashSet<String>();
//         for (String element : h_set){
//             System.out.println(h_set2.contains(element) ? "Yes" : "No");
//          }
//     }
//}
//
//11. Write a Java program to compare two sets and retain elements which are same on both sets.
//
// public static void main(String[] args)
//    {
//        Integer[] i1 = {1, 2, 3, 4, 5, 4};
//
//        Integer[] i2 = {3, 4, 5, 6, 7, 4};
//
//        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));
//
//        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));
//
//        set1.retainAll(set2);
//
//        System.out.println(set1);     //Output : [3, 4, 5]
//    }
//}
//12. Write a Java program to remove all of the elements from a hash set.
// public static void main(String[] args) {

 //        HashSet<String> h_set = new HashSet<String>();

 //        h_set.add("Red");
  //       h_set.add("Green");
  //       h_set.add("Black");
  //       h_set.add("White");
  //       System.out.println("Original hash set contains: "+ h_set);
   //      h_set.clear();
  //       System.out.println("HashSet content: "+h_set);
// }
//        }
//13. Write a Java Program to find duplications
// public static void main(String[] args)
 {
 //        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

  //       for (int i = 0; i < my_array.length-1; i++)
  //       {
   //              for (int j = i+1; j < my_array.length; j++)
    //             {
    //                     if ((my_array[i] == my_array[j]) && (i != j))
     //                    {
     //                            System.out.println("Duplicate Element : "+my_array[j]);
     //                    }
     //            }
    //     }
// }
       }
       }




