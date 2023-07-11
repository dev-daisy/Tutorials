package demo.linkedinlearning.java11;

import java.util.Scanner;

public class DebugErrors {


	// a breakpoint allows you to stop the program at a particular line of code, and is thus a useful debugging tool.
	// Source code with a logic error will compile, but it will not behave as expected.
	// Source code that has a syntax error will not compile, and spelling a keyword wrong is a common cause of this.
	// A breakpoint is a useful tool to examine whether a piece of code is being executed or skipped.

	 public static void main(String[] args) {


		/*
		    System.out.println("Let's calculate the area of a triangle");

	        Scanner input = new Scanner(System.in);

	        System.out.println("Please input the base of the triangle (in inches).");
	        double base = input.nextDouble()

	        while (base <= 0) {
	            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
	            base = input.nextDouble();
	        }

	        System.out.println("Please input the height of the triangle (in inches).");
	        double height = input.nextDouble();
	        while (height <= 0) {
	            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
	            base = input.nextDouble();
	        }

	        double area = (base * height) / 2;
	        System.out.println("The area is " + height);

		 */

		// the correct way

	 	System.out.println("Let's calculate the area of a triangle");

		Scanner input = new Scanner(System.in);

		System.out.println("Please input the base of the triangle (in inches).");
		double base = input.nextDouble();

		while (base <= 0) {
		    System.out.println("That's invalid. Please input the base of the triangle (in inches).");
		    base = input.nextDouble();
		}

		System.out.println("Please input the height of the triangle (in inches).");
		double height = input.nextDouble();
		while (height <= 0) {
		    System.out.println("That's invalid. Please input the height of the triangle (in inches).");
		    height = input.nextDouble();
		}

		double area = (base * height) / 2;
		System.out.println("The area is " + area);

		input.close();
    }
}
