package demo.w3school.classes.abstraction.interfaces;

public class Interface implements  Printable, Showable, Readable{

	// In this example, the Printable interface has only one method, and its implementation is provided in the A6 class.
	public void print(){System.out.println("Hello");}
	public void show(){System.out.println("Welcome");}
	public void read(){System.out.println("Read");}

	public static void main(String args[]){

		// In this example, the Printable interface has only one method, and its implementation is provided in the A6 class.
		Interface obj = new Interface();
		obj.print();

		// Using interface: by third user
		Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()
		d.draw();

		// Java 8 Static Method in Interface
		Drawable d1=new Rectangle();
		d1.draw();
		System.out.println(Drawable.cube(3));

		// Multiple inheritance in Java by interface
		Interface obj2 = new Interface();
		obj2.print();
		obj2.show();

		// Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
		// As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class
		// because of ambiguity. However, it is supported in case of an interface because there is no ambiguity.
		// It is because its implementation is provided by the implementation class. For example:
		Interface obj3 = new Interface();
		obj3.print();

		// Interface inheritance
		Interface obj4 = new Interface();
		obj4.print();
		obj4.read();
	}
}
