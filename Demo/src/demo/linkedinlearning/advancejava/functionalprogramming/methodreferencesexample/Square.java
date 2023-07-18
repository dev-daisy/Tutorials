package demo.linkedinlearning.advancejava.functionalprogramming.methodreferencesexample;

// Method references are a shorthand way of writing a certain type of lambda expression.
// If you have a lambda expression that passes in a variable and then calls a method on
// that variable, you can replace it with a method reference.


public class Square {


	// private field of type int
    int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int calculateArea() {
        return sideLength*sideLength;
    }

}
