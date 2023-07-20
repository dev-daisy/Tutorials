package demo.w3school.classes;

/*
Java Class Attributes
In the previous chapter, we used the term "variable" for x in the example (as shown below).
It is actually an attribute of the class. Or you could say that class attributes are variables within a class:
*/

public class Attributes {

	// x is a class attribute
	// a variable within the class
	int x = 5;
	int y;

	// The final keyword is useful when you want a variable to always store the same value,
	// like PI (3.14159...).
	final int z = 10;

	public static void main(String[] args) {
		Attributes myObj = new Attributes();

		// accessing x attribute to print its value
	    System.out.println(myObj.x);


	    // modify attributes
	    myObj.y = 30;
	    System.out.println(myObj.y);

	    // override attributes
	    myObj.x = 40;
	    System.out.println(myObj.x);


	    //myObj.z = 25; // will generate an error: cannot assign a value to a final variable
	    System.out.println(myObj.z);

	}
}
