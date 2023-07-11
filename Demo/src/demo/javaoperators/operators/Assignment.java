package demo.javaoperators.operators;

import demo.commonsteps.CommonSteps;

public class Assignment {

	public static void assignment(){

		//Assignment Operators
		// = += -= *= /= %=
		int x = 5;
		CommonSteps.printInt(x);
		x += 8;
		CommonSteps.printInt(x);
		x -= 5;
		CommonSteps.printInt(x);
		x *= 9;
		CommonSteps.printInt(x);
		x /= 2;
		CommonSteps.printFloat((float)x);
		x %= 5;
		CommonSteps.printDouble((double)x);

	}
}
