package demo.javaoperators.operators;

import demo.commonsteps.CommonSteps;

public class Unary {

	public static void increment(){

		// ++i, i++, i = i + 1
		int i = 3;
		CommonSteps.printInt(i);

		int a = ++i;
		int b = i++;
		int c = i + 1;

		CommonSteps.printInt(a);
		CommonSteps.printInt(b);
		CommonSteps.printInt(c);

	}

	public static void decrement(){

		// --i, i--, i = i - 1
		int i = 6;
		CommonSteps.printInt(i);

		int a = --i;
		int b = i--;
		int c = i - 1;

		CommonSteps.printInt(a);
		CommonSteps.printInt(b);
		CommonSteps.printInt(c);

	}
}
