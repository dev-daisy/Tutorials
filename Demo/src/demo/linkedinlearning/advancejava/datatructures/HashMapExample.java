package demo.linkedinlearning.advancejava.datatructures;

// Hashmaps are a common data structure used in Java programing.
// They allow you to store pairs of values together
// Ex. Phonebook
// key-value pair
// key - name / value - number
// Hashmaps are unordered
// Entries stored by their contents not by position/index
// Do not allowed duplicate keys
// Hashmaps also allow you to have null as the value for a key
// So hashmaps are a useful way to store pairs of values without allowing for duplicate keys.
// Normal HashMap there is no guarantee that you can get the entries back in the same order that you put them in.


import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> phonebook = new HashMap<>();

        // assign value to the key
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 98765);
        phonebook.put("Brenda", 123123);
        System.out.println(phonebook);

        // replaces the first value
        phonebook.put("Brenda", 22222);
        System.out.println(phonebook);


        phonebook.put(null, 000);
        System.out.println(phonebook);

        // search inside the hashmap
        // remove specific item
        if(phonebook.containsKey("Brenda")) {
            phonebook.remove("Brenda");
        }
        System.out.println(phonebook);

        // to remove all entries
        phonebook.clear();
        System.out.println(phonebook);


    }
}
