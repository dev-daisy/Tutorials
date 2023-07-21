package demo.w3school.datatypes;

public class DataTypes {

	/*
	 *

Java Data Types
As explained in the previous chapter, a variable in Java must be a specified data type:

Data types are divided into two groups:

Primitive data types
- includes byte, short, int, long, float, double, boolean and char
- A primitive data type specifies the size and type of variable values, and it has no additional methods.
- Primitive types are predefined (already defined) in Java.
- A primitive type has always a value;
- A primitive type starts with a lowercase letter,
Non-primitive data types - such as String, Interfaces, Arrays and Classes (you will learn more about these in a later chapter)
- Non-primitive types are created by the programmer and is not defined by Java (except for String).
- non-primitive types can be null.
- Non-primitive types can be used to call methods to perform certain operations
- Non-primitive types starts with an uppercase letter.

	 *
	 */


	public static void main(String[] args) {

		// There are 8 types of primitive data types:
		// boolean data type
		//     The Boolean data type is used to store only two possible values: true and false.
		//     This data type is used for simple flags that track true/false conditions.
		//     The Boolean data type specifies one bit of information, but its "size" can't be defined precisely.
		Boolean one = false ;
		System.out.println(one);
		boolean isJavaFun = true;
		System.out.println(isJavaFun);     // Outputs true

		// byte data type
		//     The byte data type is an example of primitive data type. It isan 8-bit signed two's complement integer.
		//     Its value-range lies between -128 to 127 (inclusive). Its minimum value is -128 and maximum value is 127.
		//     Its default value is 0.
		//     The byte data type is used to save memory in large arrays where the memory savings is most required.
		//     It saves space because a byte is 4 times smaller than an integer.
		//     It can also be used in place of "int" data type.
		byte a = 10,  b = -20;
		System.out.println(a);
		System.out.println(b);


		// short data type
		short s = 10000,  r = -5000  ;
		System.out.println(s);
		System.out.println(r);


		// int data type
		int a1 = 100000,  b1 = -200000  ;
		System.out.println(a1);
		System.out.println(b1);


		// long data type
		long a3 = 100000L,  b4 = -200000L  ;
		System.out.println(a3);
		System.out.println(b4);


		// float data type
		float f1 = 234.5f ;
		System.out.println(f1);
		f1 = 35e3f; // scientific
		System.out.println(f1);


		// double data type
		double d1 = 12.3  ;
		System.out.println(d1);
		d1 = 12E4d; // scientific
		System.out.println(d1);


		// char data type
		// Alternatively, if you are familiar with ASCII values, you can use those to display certain characters:
		// https://www.w3schools.com/charsets/ref_html_ascii.asp
		char letterA = 'A'  ;
		System.out.println(letterA);
		char myVar1 = 65, myVar2 = 66, myVar3 = 67;
		System.out.println(myVar1);
		System.out.println(myVar2);
		System.out.println(myVar3);

	}
}
