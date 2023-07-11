package demo.linkedinlearning.java11;

import java.util.Scanner;

public class ReferenceDataTypes {

	public static void main(String[] args) {

		// String : a sequence of ordered characters
		// use quotation ""
		// a string is built out of characters (char)
		// check data structures to find out more
		// string "Kayla", index 0 = 'K', index 1 = 'a' and soon..


        String studentFirstName = "Kayla";
        String studentLastName = "Hammon";

        System.out.println(studentFirstName);
        System.out.println(studentLastName);

        // charAt - is a special string operation that allows us to access a character at a
        // specific location within the string or index of the string
        // - Input : index of character
        // - Output : the value of the character at the inputted index

        // since charAt was accessed through String instance
        // charAt is an instance (non-static) method instead of a class (static) method
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);


        // string concatenation - use "+" sign
        System.out.println("Students name is " + " " + studentFirstName + " " + studentLastName);


        //input and output in java
        // dynamically change the value
        // the Scanner - has some built in operations that will allow us
        // to retrieve input from the user
        // Scanner is also a special datatype
        System.out.println("Enter the GPS of the student?");

        Scanner input = new Scanner(System.in);
        double studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName +
                " now has a GPA of " + studentGPA);

        input.close();

	}
}
