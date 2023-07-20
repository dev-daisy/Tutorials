package demo.w3school.classes.methods;

import java.text.NumberFormat;
import java.util.Scanner;

// Create a Methods class
public class Methods {

	// Static method
	// which means that it can be accessed without creating an object of the class
	static void myStaticMethod() {
	    System.out.println("Hello World!");
	}

	// Public method
	// which can only be accessed by objects
	// Public method
	public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	}

  	// Create a fullThrottle() method
	public void fullThrottle() {
	    System.out.println("The car is going as fast as it can!");
	}

	// Create a speed() method and add a parameter
	public void speed(int maxSpeed) {
	    System.out.println("Max speed is: " + maxSpeed);
	}

	// Main method
	public static void main(String[] args) {

		myStaticMethod(); // Call the static method
	    // myPublicMethod(); This would compile an error

		Methods myObj = new Methods(); // Create an object of Methods
	    myObj.myPublicMethod(); // Call the public method on the object


	    // Access Methods With an Object
	    Methods myCar = new Methods();   // Create a myCar object
	    myCar.fullThrottle();      // Call the fullThrottle() method
	    myCar.speed(200);          // Call the speed() method

	    // methods are user-defined

	    //-----------------------------------
	    // Predefined Method
	    // In Java, predefined methods are the method that is already defined in the Java class libraries is known as predefined methods.
	    // It is also known as the standard library method or built-in method.
	    // We can directly use these methods just by calling them in the program at any point.
	    // Some pre-defined methods are length(), equals(), compareTo(), sqrt(), etc.
	    // When we call any of the predefined methods in our program, a series of codes related to the corresponding method runs in the background that is already stored in the library.
	    // Each and every predefined method is defined inside a class.
	    // Such as print() method is defined in the java.io.PrintStream class.
	    // It prints the statement that we write inside the method.
	    // For example, print("Java"), it prints Java on the console.

	    // using the max() method of Math class
	    System.out.print("The maximum number is: " + Math.max(9,7));

	    //-----------------------------------


	    // Factory method
	    // It is a method that returns an object to the class to which it belongs.
	    // All static methods are factory methods
	    NumberFormat obj = NumberFormat.getNumberInstance();
	}

	/*
	 *
		Remember that..
		The dot (.) is used to access the object's attributes and methods.

		To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).

		A class must have a matching filename (Main and Main.java).

	 *
	 */




}
