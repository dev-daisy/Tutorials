/**
 *
 */
package demo.linkedinlearning.advancejava.functionalprogramming;

/**
 * @author da.rota
 *
 */

// A functional interface is an interface that has only one abstract method.

// In Java 8, a new feature was introduced called lambdas.
// Lambdas represent the implementation of a functional interface.

// annotation functional interface
//To show that it conforms to the rules of a functional interface.
@FunctionalInterface
public interface GreetingMessage {

	// abstract method
	// string argument
    public abstract void greet(String name);

    // Adding below line will cause an error to where the annotation is declared
    // The GreetingMessages Interface
    // This tells me that my greeting message interface is no longer
    // a functional interface because there are multiple non-overriding abstract methods.
    //public abstract void test();


}
