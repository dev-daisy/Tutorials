package demo.w3school.method;

// With method overloading, multiple methods can have the same name with different parameters:

public class MethodOverloading {

		static int plusMethodInt(int x, int y) {
		  return x + y;
		}

		static double plusMethodDouble(double x, double y) {
		  return x + y;
		}

		static int plusMethod(int x, int y) {
		  return x + y;
		}

		static double plusMethod(double x, double y) {
		  return x + y;
		}


		public static void main(String[] args) {

		  int myNum1 = plusMethodInt(8, 5);
		  double myNum2 = plusMethodDouble(4.3, 6.26);
		  System.out.println("int: " + myNum1);
		  System.out.println("double: " + myNum2);

		  myNum1 = plusMethod(8, 5);
		  myNum2 = plusMethod(4.3, 6.26);
		  System.out.println("int: " + myNum1);
		  System.out.println("double: " + myNum2);
		}
}
