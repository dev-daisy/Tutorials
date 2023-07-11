package demo.linkedinlearning.java11;

public class ClassTriangle {

	// these are the 5 attributes initializations for this class
	// but no value yet
	// also called an instance variables because they are variables that each instance will have an individual value for.
	// We could assign a default value to these instance variables,
	// usually, we want a constructor to initialize them
	// this attributes can be accessed throughout the ClassTrangle Class
	// these are also called non-static instance variables
	// their values are not the same for every object instance
	// their values change depending on the object instance
	double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;


    // Static class variable do not change per instance
    // they hold a value for the whole class to use
    // static variable's value belongs to the class rather than a particular instance
    // access using the dot (.) operator using it's class were it is defined
    static int numOfSides = 3;

    // a constructor without inputs/parameters
    // a blueprint
    public ClassTriangle(){

    }


    // a constructor does not have a return data type
    // a constructor is just one behavior or method that a class can have
    // but we can create as many methods as we want
    // method is just another name for behavior/function that belongs to a class
    // a constructor with inputs/parameters
    // a constructor can add parameters to give a dynamic value for each attribute
    // the parameter name can be different than the attribute name
    // keyword this helps our program make a distinction between the attribute variable and the parameter variable
    public ClassTriangle(double base, double height,
                    double sideLenOne, double sideLenTwo,
                    double sideLenThree) {

    	// use the above inputs/constructors parameters to assign value to each attributes
    	// this keyword was use to call the attributes
    	// above constructor parameters are only accessible inside this constructor

        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    // this is a function with a double return data type
    // this is an instance method
    // instance method are also referred to as non-static methods
    // since you need an instance to use them
    public double findArea() {
        return (this.base * this.height) / 2;
    }
}
