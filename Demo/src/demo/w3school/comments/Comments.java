package demo.w3school.comments;

public class Comments {


	/*
	 *

Java Comments
The Java comments are the statements in a program that are not executed by the compiler and interpreter.

Why do we use comments in a code?
Comments are used to make the program more readable by adding the details of the code.
It makes easy to maintain the code and to find the errors easily.
The comments can be used to provide information or explanation about the variable, method, class, or any statement.
It can also be used to prevent the execution of program code while testing the alternative code.
Types of Java Comments
There are three types of comments in Java.

Single Line Comment
	The single-line comment is used to comment only one line of the code.
	It is the widely used and easiest way of commenting the statements.
	Single line comments starts with two forward slashes (//). Any text in front of // is not executed by Java.
Multi Line Comment
	The multi-line comment is used to comment multiple lines of code.
	It can be used to explain a complex code snippet or to comment multiple lines of code at a time (as it will be difficult to use single-line comments there).
Documentation Comment
	Documentation comments are usually used to write large programs for a project or software application as it helps to create documentation API.
	These APIs are needed for reference, i.e., which classes, methods, arguments, etc., are used in the code.
	To create documentation API, we need to use the javadoc tool.

	 *
	 */


	 /**
	    * Sample of Documentation Comment
	    * This is the main method uses of sum() method.
	    * @param args Unused
	    * @see IOException
	    */

	public static void main(String[] args) {

		// This is single line comment
		int i=10; // i is a variable with value 10
		System.out.println(i);  //printing the variable i


		/* Let's declare and
		 print variable in java. */
		int j=10;
		    System.out.println(j);
		/* float j = 5.9;
		    float k = 4.4;
		    System.out.println( j + k ); */
	}
}
