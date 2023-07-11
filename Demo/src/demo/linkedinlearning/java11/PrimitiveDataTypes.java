package demo.linkedinlearning.java11;

public class PrimitiveDataTypes {

	// We describe the types of data an object has in a Class with
	// properties or attributes

	// data type provides a positive values
	// 2 main categories of datatypes
	// 1. Primitive Data Types :
	// - basis for all other  data types  wthin Java Programming Langauge
	// Boolean - true or false value
	// int - represents whole number, an integer
	// double - decimal number
	// char - single letter/symbol, a character, use ''
	// 2. Reference Data Types:

	public static void main(String[] args) {

		//variable is a way to label data and reference it later in the program
		// a variable has data type, label, and value
		// "=" sign is an assignment operator that assigns the int variable with the label
        int studentAge = 15;
        double studentGPA = 3.45;
        char studentFirstInitial = 'K';
        char studentLastInitial = 'H';
        boolean hasPerfectAttendance = true;

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
    }

}
