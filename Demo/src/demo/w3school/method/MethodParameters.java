package demo.w3school.method;

// Parameters and Arguments
// Information can be passed to methods as parameter. Parameters act as variables inside the method.

// Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

// The following example has a method that takes a String called fname as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name:

public class MethodParameters {

		// Single Parameters
		static void myMethod1(String fname) {
			System.out.println(fname + " Refsnes");
		}


		// Multiple Parameters
		static void myMethod2(String fname, int age) {
		    System.out.println(fname + " is " + age);
		}

		// Return Values
		static int myMethod3(int x) {
		    return 5 + x;
		}
		static int myMethod4(int x, int y) {
		    return x + y;
		}

		// A Method with If...Else
		// It is common to use if...else statements inside methods:
		// Create a checkAge() method with an integer variable called age
		static void checkAge(int age) {

		    // If age is less than 18, print "access denied"
		    if (age < 18) {
		      System.out.println("Access denied - You are not old enough!");

		    // If age is greater than, or equal to, 18, print "access granted"
		    } else {
		      System.out.println("Access granted - You are old enough!");
		    }

		}


		public static void main(String[] args) {
		    myMethod1("Liam");
		    myMethod1("Jenny");
		    myMethod1("Anja");

		    myMethod2("Liam", 5);
		    myMethod2("Jenny", 8);
		    myMethod2("Anja", 31);

		    System.out.println(myMethod3(3));

		    int z = myMethod4(5, 3);
		    System.out.println(z);

		    checkAge(20); // Call the checkAge method and pass along an age of 20
		}
}
