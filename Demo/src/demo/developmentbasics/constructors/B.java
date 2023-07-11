package demo.developmentbasics.constructors;

import demo.commonsteps.CommonSteps;

public class B {

	public void display(){
		A testObj = new A(5, 10);
		A testObj2 = new A(6, 7);
		A testObj3 = new A(8.7f);

		CommonSteps.printInt(testObj.var1); //print the value "5"
		CommonSteps.printInt(testObj2.var2); //print the value "6"
		CommonSteps.printFloat(testObj3.var3); //print the value "8.7"
	}

	public static void main(String[] args){
		B b = new B();
		b.display();
	}
}
