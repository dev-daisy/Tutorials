package demo.developmentbasics.classmethods;

public class A {

	// public mean in order to use this method, need to create an object out of class A
	// and then call this method on that object
	// keyword void -> doesn't return anything
	// name of this method is printThis
	// naming convention is camel case (start with lower case)
	// String toPrint -> method parameters are pieces of data are pass along to that method
	// It is called parameters if defined in the method
	// no limit of parameters
	public void printThis(String toPrint) {
		System.out.println(toPrint);
	}

	// advantage in java, can reuse the code by passing different parameters
	public int addTwo(int n){
		return n + 2;
	}

	// returnValue is an overloaded method
	// have the same name but different parameter data types an int and a float
	public int returnValue(int p){
		return p;
	}
	public float returnValue(float f){
		return f;
	}

	// static method is void because not returning anything
	// because the method is static, no need for an object instance to call this method
	static void staticPrint(String toPrint1){
		System.out.println(toPrint1);
	}
}
