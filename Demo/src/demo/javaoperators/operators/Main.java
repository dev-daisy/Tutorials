package demo.javaoperators.operators;

import demo.commonsteps.CommonSteps;
import demo.developmentbasics.modifiers.UserInput;

public class Main {

	public static void main(String[] args){


		UserInput ui = new UserInput();
		ui.getUserInput();
		String x = ui.getInp();

		CommonSteps.printString("Arithmetic Results : + - * / % ");
		Arithmetic.add();
		Arithmetic.subtract();
		Arithmetic.multiply();
		Arithmetic.divide();
		Arithmetic.modulo();
		CommonSteps.printString("Assignment Results : = += -= *= /= %= ");
		Assignment.assignment();
		CommonSteps.printString("Unary Results : ++");
		Unary.increment();
		CommonSteps.printString("Unary Results : --");
		Unary.decrement();
	}
}
