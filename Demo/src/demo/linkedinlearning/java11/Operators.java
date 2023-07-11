package demo.linkedinlearning.java11;

import java.util.Scanner;

public class Operators {

	// map out the control flow of the program

	// Flow chart:
	// circle -> start of program
	// parallelogram -> input or output
	// diamond -> decision, represented by the `if` statement in Java.

	// Decision block/control flow statements
	// - Control flow statements allow code to be executed in different ways besides the default sequential order.
	// - will make the decision about the code statements to run
	// on each execution of the program

	// relational operators:
	// <, >, ==, >=, <=, !=

	public static void main(String[] args) {


		//if, if-else statement
		System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }
        scanner.close();

    }

}
