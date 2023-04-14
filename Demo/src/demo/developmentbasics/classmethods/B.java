package demo.developmentbasics.classmethods;

public class B {

	public void useCase(){

		// object -> new instance of A class
		A obj1 = new A();

		// call the public method
		// It is called an argument if send as a concrete pieces of data or a value
		obj1.printThis("default");

		// to use a static method just call the class where the static is created
		A.staticPrint("static");

		int anInt = 5;
		float aFloat = 6.7f;
		System.out.println(obj1.returnValue(anInt));
		System.out.println(obj1.returnValue(aFloat));
	}

	public static void main(String[] args){

		B b = new B();
		b.useCase();
	}
}
