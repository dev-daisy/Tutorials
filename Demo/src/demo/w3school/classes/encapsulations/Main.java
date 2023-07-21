package demo.w3school.classes.encapsulations;

/*
 *
Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable
Get and Set
You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.

The get method returns the variable value, and the set method sets the value.

Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:

Why Encapsulation?
Better control of class attributes and methods
Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
Flexible: the programmer can change one part of the code without affecting other parts
Increased security of data

 *
 */



public class Main {
	public static void main(String[] args) {
	    Person myObj = new Person();
	    //myObj.name = "John";  // error: name has private access in Person
	    myObj.setName("John"); // Set the value of the name variable to "John"
	    System.out.println(myObj.getName()); // error
	}
}