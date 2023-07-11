package demo.javaoperators.operators;

import demo.commonsteps.CommonSteps;
import demo.developmentbasics.modifiers.UserInput;

public class Arithmetic {

	//Java Arithmetic
	// + - * / %
	static int a = 5 + 7; // a == 12
	static int b = a - 2; // b == 10
	static int c = a * b; // c == 120
	static double d = (double) c / 3; // d == 40.0
	static int e = (int)d % 3; // e == 1



	public static void add(){
		CommonSteps.printInt(a);
	}

	public static  void subtract(){
		CommonSteps.printInt(b);
	}

	public static  void multiply(){
		CommonSteps.printInt(c);
	}

	public static void divide(){
		CommonSteps.printDouble(d);
	}

	public static void modulo(){
		CommonSteps.printInt(e);
	}
}
