package demo.javaoperators.operators;

import demo.commonsteps.CommonSteps;

public class Relational {


	int a = 3;
	int b = 5;
	int c = 7;
	int d = 3;

	// ==, !=, >, >=, <, <=

	public void doubleEqualSign(){

		CommonSteps.printBoolean(a == d);
		CommonSteps.printBoolean(a == b);
	}

	public void notEqualSign(){

		CommonSteps.printBoolean(a != d);
		CommonSteps.printBoolean(a != b);
	}

	public void greaterThanSign(){

		CommonSteps.printBoolean(a > b);
		CommonSteps.printBoolean(b > a);
	}

	public void greaterThanEqualSign(){

		CommonSteps.printBoolean(a >= b);
		CommonSteps.printBoolean(b >= a);
	}

	public void lesserThanSign(){

		CommonSteps.printBoolean(a > b);
		CommonSteps.printBoolean(b > a);
	}

	public void lesserThanEqualSign(){

		CommonSteps.printBoolean(a >= c);
		CommonSteps.printBoolean(c >= a);
	}
}
