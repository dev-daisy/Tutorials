package demo.w3school.classes.modifiers;

// Modifiers
// By now, you are quite familiar with the public keyword that appears in almost all of our examples:
// The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.

// We divide modifiers into two groups:

// Access Modifiers - controls the access level
// Non-Access Modifiers - do not control access level, but provides other functionality

public class Main {
	  final int x = 10;
	  final double PI = 3.14;

	  // Static method
	  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

	  public static void main(String[] args) {

	    Main myObj = new Main();
	    //myObj.x = 50; // will generate an error: cannot assign a value to a final variable
	    //myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
	    System.out.println(myObj.PI);


	    myStaticMethod(); // Call the static method
	    // myPublicMethod(); This would output an error

	    myObj = new Main(); // Create an object of Main
	    myObj.myPublicMethod(); // Call the public method

	    // Code from filename: Main.java
	    // create an object of the Student class (which inherits attributes and methods from Second)
	    Student myObj1 = new Student();

	    System.out.println("Name: " + myObj1.fname);
	    System.out.println("Age: " + myObj1.age);
	    System.out.println("Graduation Year: " + myObj1.graduationYear);
	    myObj1.study(); // call abstract method
	  }

}
