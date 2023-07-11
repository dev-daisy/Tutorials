package demo.linkedinlearning.java11;

public class Parameters {


	// user-defined functions - created by a developers
	// built-in functions - functions already made in java

	// functions with defined inputs
	// a parameter in a function
	// this inputs are local variable for this function only

	//The function now requires three `double` parameters, which are specified correctly in this example.
	public static void calculateTotalMealPrice(double listedMealPrice,
        double tipRate,
        double taxRate) {

		double tip = tipRate * listedMealPrice;
		double tax = taxRate * listedMealPrice;
		double result = listedMealPrice + tip + tax;
		System.out.println("Your total meal price is " + result);
	}

	public static void main(String[] args) {

		// calling a function with parameters
		// input data into a functions using Parameters
		// A valid function call uses arguments that match the parameter list of the function.

		calculateTotalMealPrice(15, .20, .08);
		calculateTotalMealPrice(25, .18, .08);
	}

}
