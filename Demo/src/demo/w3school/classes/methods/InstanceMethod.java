package demo.w3school.classes.methods;

// The method of the class is known as an instance method. It is a non-static method defined in the class.
// Before calling or invoking the instance method, it is necessary to create an object of its class.
// Let's see an example of an instance method.

// There are two types of instance method:
// 1. Accessor Method
// The method(s) that reads the instance variable(s) is known as the accessor method.
// We can easily identify it because the method is prefixed with the word get.
// It is also known as getters.
// It returns the value of the private field.
// It is used to get the value of the private field.

// 2. Mutator Method
// The method(s) read the instance variable(s) and also modify the values.
// We can easily identify it because the method is prefixed with the word set.
// It is also known as setters or modifiers.
// It does not return anything. It accepts a parameter of the same data type that depends on the field.
// It is used to set the value of the private field.


public class InstanceMethod {


	//---------------------------------------------
	// Accessor and Mutator example
	private int roll;
	private String name;
	public int getRoll()    //accessor method
	{
		return roll;
	}
	public void setRoll(int roll) //mutator method
	{
		this.roll = roll;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void display()
	{
		System.out.println("Roll no.: "+roll);
		System.out.println("Student name: "+name);
	}
	//---------------------------------------------


	public static void main(String [] args)
	{
		//Creating an object of the class
		InstanceMethod obj = new InstanceMethod();
		//invoking instance method
		System.out.println("The sum is: "+obj.add(12, 13));
	}

	int s;

	//user-defined method because we have not used static keyword
	public int add(int a, int b)
	{
		s = a+b;
		//returning the sum
		return s;
	}
}
