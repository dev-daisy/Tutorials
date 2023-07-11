package demo.linkedinlearning.java11;

public class Classes {

	// one way to make our program easier to read is with clasess
	// A class is a user-defined blueprint that has a set of attributes
	// and behaviors that define the item that it is supposed to represent

	// a class was compose of attributes/properties - base, height, sides of an object
	// behaviors/method in java - functions that are related to and located inside a class
	// behaviors can use or manipulate attributes of the class

	// a class is a particular way we've decided to store and organize data about a certain object
	// a newly created class with a constructor is now also a data type

	// keyword static - if the function does not use the attributes of a class
	// but still relates to the overall theme or idea of the class

	// instance - is an object created from a class blueprint
	// use a class to create an object in code

	// constructor - is a special method or behavior inside every class that creates and initializes instances
	// a constructor must have the same name as a class name
	// constructor always returns an instance of the class
	// constructor would be dynamic or capable of action or change
	// use a new keyword to create new instance of the constructor

	public static void main(String[] args) {

		// to create a ClassTriangle Blueprint
		// it was assigned to triangleA and triangleB variable
		// and call the constructor method of a ClassTriangle using new keyword
		// below are now the ClassTriangle instances
		// different instance will have different different attributes depending on the assignments during call of constructor
		// each instance the attributes are being initialized
		ClassTriangle triangleA = new ClassTriangle(15, 8, 15, 8, 17);
		ClassTriangle triangleB = new ClassTriangle(3, 2.598, 3, 3,3);

		// to get access of the ClassTriangle class functions, we use the dot (.) operator of the created object above
        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);
        // instance methods vs. class methods
        // ClassTrangle.findArea() is wrong, because the ClassTriangle does not exist yet
        // instead we have to create first an instance for a ClassTriangle

        // Triangle.findArea()? --> Math.pow(2,3)?

        // but for Math.pow()
        // we did not need to create an instance of Math to use pow methods
        // because pow is not an instance method
        // it is a static method or class method
        // we did not need an instance of the class in order to use the function
        // class methods are referred to as static methods
        // because you do not need an instance to use them

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);

        // access instance variable, attribute variable
        // accessing a variable and not calling a functions so no need for parens "()"
        System.out.println(triangleA.sideLenThree);
        System.out.println(triangleB.base);


        System.out.println(ClassTriangle.numOfSides);

    }

}
