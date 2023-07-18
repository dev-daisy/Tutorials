package demo.linkedinlearning.advancejava.datatructures;

import java.util.LinkedHashMap;
import java.util.Map;

// HashMap, the order of the entries is retained.
// With Linked HashMaps, you can specify if you want the elements
// to be retrieved in the order that they were added in,
// or in the order that they have been accessed in.

public class LinkedHashMapExample {

    public static void main(String[] args) {

    	// Constructor with no argument
        LinkedHashMap<String, Integer> phonebook1 = new LinkedHashMap();
        phonebook1.put("Kevin", 12345);
        phonebook1.put("Jill", 98765);
        phonebook1.put("Brenda", 123123);
        phonebook1.put("Gary", 22222);
        System.out.println("Kevin's number: " + phonebook1.get("Kevin"));

        System.out.println("\nList of contacts in phonebook1:");
        for(Map.Entry<String, Integer> entry: phonebook1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    	// uses a different contractor that takes 3 arguments
        // 4 entries
        // 0.75f load factor - default value
        // true/false - order of the mode,
        // if false or empty, it will use insertion order,
        // this returns the elements in the order that they were inserted into the map
        //LinkedHashMap<String, Integer> phonebook2 = new LinkedHashMap(4, 0.75f);
        LinkedHashMap<String, Integer> phonebook2 = new LinkedHashMap(4, 0.75f, false);
        phonebook2.put("Kevin", 12345);
        phonebook2.put("Jill", 98765);
        phonebook2.put("Brenda", 123123);
        phonebook2.put("Gary", 22222);
        System.out.println("\nKevin's number: " + phonebook2.get("Kevin"));
                System.out.println("\nList of contacts in phonebook2:");
        for(Map.Entry<String, Integer> entry: phonebook2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        // However, if I go back to the link HashMap constructor and pass in true instead of false,
        // it will use access order instead. Now, when I run the program,
        // it prints out Kevin's name in the first line of output, but in the list of contacts,
        // Kevin is now at the bottom, instead of at the top.
        // This is because I accessed Kevin's number the most recently, when I printed it out.
        LinkedHashMap<String, Integer> phonebook3 = new LinkedHashMap(4, 0.75f, true);
        phonebook3.put("Kevin", 12345);
        phonebook3.put("Jill", 98765);
        phonebook3.put("Brenda", 123123);
        phonebook3.put("Gary", 22222);
        System.out.println("\nKevin's number: " + phonebook3.get("Kevin"));
        System.out.println("\nList of contacts in phonebook3:");
        for(Map.Entry<String, Integer> entry: phonebook3.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // So the entry that was modified the longest time ago is at the top and the most recent at the bottom.
        // So, linked HashMaps are different than normal HashMaps, in that they keep track of the order of the entries.
        // They're also flexible, in that you have the choice of accessing elements by when they were added or when they were modified.
    }


}
