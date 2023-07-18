package demo.linkedinlearning.advancejava.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {

        // Example without Generics
	    List names = new ArrayList();
	    names.add("Kelly");
	    String name = (String) names.get(0);
	    System.out.println("First name: " + name);
	    names.add(7); // will not cause an error


	    // Example with Generics

	    // List of Strings
	    // Advantage of using Generics is that the compiler checks
	    // that only Strings are added to the List makes the code safer
	    // Specify the Data Type once when using the list
	    List<String> names2 = new ArrayList();
	    names2.add("Kelly");
	    String name2 = names2.get(0);
	    System.out.println("First name: " + name2);
	    //names2.add(7); // this will cause error because it is in integer

	}
}
