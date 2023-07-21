package demo.w3school.classes.constructors;

// Java Constructors
// A constructor in Java is a special method that is used to initialize objects.
// The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

//Create a Main class
public class Main {

	  int x;  // Create a class attribute

	  // Create a class constructor for the Main class
	  public Main() {
		  x = 5;  // Set the initial value for the class attribute x
	  }

	  // Constructor Parameters
	  // Constructors can also take parameters, which is used to initialize attributes.
	  public Main(int y) {
		    x = y;
	  }

	  public static void main(String[] args) {
		  Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    	  System.out.println(myObj.x); // Print the value of x

    	  myObj = new Main(5);
    	  System.out.println(myObj.x);
	  }
}
