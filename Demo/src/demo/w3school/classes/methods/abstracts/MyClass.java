package demo.w3school.classes.methods.abstracts;

public class MyClass  extends Demo
{
	// method impelmentation
	void display()
	{
		System.out.println("Abstract method?");
	}

	public static void main(String args[])
	{
		//creating object of abstract class
		Demo obj = new MyClass();

		//invoking abstract method
		obj.display();
	}
}
