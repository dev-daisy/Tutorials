package demo.linkedinlearning.java11;

public class ReturnTypes {

	// a function with a return type double
	// returning a value allows us to take a value of a variable
	// within a function and allow it to be accessed at a different scope of a program
	// return types can be:
	// Boolean, int, char, string and many more

	// The new function definition will have a `double` return type instead of `void`. The `return` keyword is also used in the function body.
	public static double calculateTotalMealPrice(
		double listedMealPrice,
        double tipRate,
        double taxRate
    ) {
		double tip = tipRate * listedMealPrice;
		double tax = taxRate * listedMealPrice;
		double result = listedMealPrice + tip + tax;
		return result;
	}

	public static void main(String[] args) {


		// a new variable is declared to receive the return value from the function call.
		double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .08);
		System.out.println(groupTotalMealPrice);

		double individualMealPrice = groupTotalMealPrice / 5;
		System.out.println(individualMealPrice);
	}
}
