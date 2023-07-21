package demo.w3school.classes.abstraction.abstractinterfaces;

/*
 *
Difference between abstract class and interface
Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods. Abstract class and interface both can't be instantiated.

But there are many differences between abstract class and interface that are given below.

Abstract class vs	Interface
1) Abstract class can have abstract and non-abstract methods.
Interface can have only abstract methods. Since Java 8, it can have default and static methods also.

2) Abstract class doesn't support multiple inheritance.
Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.
Interface has only static and final variables.

4) Abstract class can provide the implementation of interface.
Interface can't provide the implementation of abstract class.

5) The abstract keyword is used to declare abstract class.
The interface keyword is used to declare interface.

6) An abstract class can extend another Java class and implement multiple Java interfaces.
An interface can extend another Java interface only.

7) An abstract class can be extended using keyword "extends".
An interface can be implemented using keyword "implements".

8) A Java abstract class can have class members like private, protected, etc.
Members of a Java interface are public by default.

9)
Example Abstract:
public abstract class Shape{
public abstract void draw();
}

Example Interface:
public interface Drawable{
void draw();
}
 *
 */

//Creating a test class that calls the methods of A interface
class Main {
	public static void main(String args[]){
		A a=new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}
