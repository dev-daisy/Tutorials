package demo.linkedinlearning.advancejava;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {


	// Generic methods in Java are methods that allow you to create a new type parameter just for that method.
	// This is useful if you are writing a method but want to be flexible about the type of objects you can pass in.
	// also known as Type Parameter

	// Type parameters support multiple bounds, wildcards don't.

	//Array examples
    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    // First approach - not using a Generic Method
    // A method called objectArrayToList that iterates through all of the objects in an array and adds them to a list.
    //  In Java, object is a parent type of all other object types, so I can pass in arrays and lists of any types to this method.

    //  Using objects means that I lose type safety.
    public static List objectArrayToList(Object[] array, List<Object> list) {
        for (Object object : array) {
            list.add(object);
        }
        return list;
    }


    // Second approach - using Generic Method
    // <T> type variable - only has local scope, meaning use it inside this particular method
    // can use it inside the method signature or inside the body ofthe method
    // List<T> - return type of the generic array to list method. Generic Type
    public static <T> List<T> genericArrayToList(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list; //List<T>
    }

    // Main method
    public static void main(String[] args) {

        // Problems when using the  first approach without using Generic Method
        List<Integer> intList = objectArrayToList(intArray, new ArrayList<>());
        System.out.println(intList.get(0));
        // there is no error when changing List<Integer> to List<String> in compiler
        // but when run, error will display " java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String"
        //List<String> stringList = objectArrayToList(intArray, new ArrayList<>());
        //System.out.println(stringList.get(0));


        //Using the  second approach with Generic Method
    	// used the array to list method to create a list of characters from charArray
        List<Character> charList = genericArrayToList(charArray, new ArrayList<>());
        System.out.println(charList.get(0));

        // a list of booleans from boolArray,
        List<Boolean> boolList = genericArrayToList(boolArray, new ArrayList<>());
        System.out.println(boolList.get(0));

        // and a list of integers from intarray.
        List<Integer> intList2 = genericArrayToList(intArray, new ArrayList<>());

        // the below line will be mark as an error
        // List<String> intList2 = genericArrayToList(intArray, new ArrayList<>());
        // System.out.println(intList2.get(0));
    }

    // Example
    // Type Parameter - supports upper bound -> extends
    public static <T extends Number> void copy(List<T> dest, List<T> src) {}

    // Type Parameter - don't support lower bound -> super
    // this won't compile
    // public static <T super Integer> void copy2(List<T> dest, List<T> src) {}


}
