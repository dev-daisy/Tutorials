package demo.w3school.controlstatements;

public class ControlStatements {

	/*
	 *

Java Control Statements | Control Flow in Java
Java compiler executes the code from top to bottom. The statements in the code are executed according to the order in which they appear. However, Java provides statements that can be used to control the flow of Java code. Such statements are called control flow statements. It is one of the fundamental features of Java, which provides a smooth flow of program.

Java provides three types of control flow statements.

Decision Making statements
- As the name suggests, decision-making statements decide which statement to execute and when.
- Decision-making statements evaluate the Boolean expression and control the program flow depending upon the result of the condition provided.
	if statements
	switch statement
Loop statements
-In programming, sometimes we need to execute the block of code repeatedly while some condition evaluates to true.
-However, loop statements are used to execute the set of instructions in a repeated order.
-The execution of the set of instructions depends upon a particular condition.
	do while loop
	while loop
	for loop
	for-each loop
Jump statements
	break statement
	continue statement

	 *
	 */


	public static void main(String[] args) {

		//-------------------------------------------------
		// Decision Making statements
		// 1) If Statement:
		//		1) Simple if statement:
				int x = 10;
				int y = 12;
				if(x+y > 20) {
					System.out.println("x + y is greater than 20");
				}
		//		2) if-else statement
				x = 10;
				y = 12;
				if(x+y < 10) {
					System.out.println("x + y is less than      10");
				}   else {
					System.out.println("x + y is greater than 20");
				}
		// 		3) if-else-if ladder:
				String city = "Delhi";
				if(city == "Meerut") {
					System.out.println("city is meerut");
				}else if (city == "Noida") {
					System.out.println("city is noida");
				}else if(city == "Agra") {
					System.out.println("city is agra");
				}else {
					System.out.println(city);
				}
		//		4. Nested if-statement
				String address = "Delhi, India";

				if(address.endsWith("India")) {
					if(address.contains("Meerut")) {
						System.out.println("Your city is Meerut");
					}else if(address.contains("Noida")) {
						System.out.println("Your city is Noida");
					}else {
						System.out.println(address.split(",")[0]);
					}
				}else {
					System.out.println("You are not living in India");
				}

		// 2) Switch Statement:
			int num = 2;
			switch (num){
			case 0:
				System.out.println("number is 0");
				break;
			case 1:
				System.out.println("number is 1");
				break;
			default:
				System.out.println(num);
			}

		//-------------------------------------------------

		// Loop Statements
		// 1) Java for loop
		// TODO Auto-generated method stub
		int sum = 0;
		for(int j = 1; j<=10; j++) {
			sum = sum + j;
		}
		System.out.println("The sum of first 10 natural numbers is " + sum);


		// 2) Java for-each loop
		// TODO Auto-generated method stub
		String[] names = {"Java","C","C++","Python","JavaScript"};
		System.out.println("Printing the content of the array names:\n");
		for(String name:names) {
			System.out.println(name);
		}

		// 3) Java while loop
		// TODO Auto-generated method stub
		int i = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		while(i<=10) {
			System.out.println(i);
			i = i + 2;
		}

		// 4) Java do-while loop
		// TODO Auto-generated method stub
		i = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		do {
			System.out.println(i);
			i = i + 2;
		}while(i<=10);


		//-------------------------------------------------
		// Jump Statements
		// 1) Java break statement
		// TODO Auto-generated method stub
		for(i = 0; i<= 10; i++) {
			System.out.println(i);
			if(i==6) {
				break;
			}
		}

		// 2) Java continue statement
		// TODO Auto-generated method stub
		for(i = 0; i<= 2; i++) {
			for (int j = i; j<=5; j++) {
				if(j == 4) {
					continue;
				}
				System.out.println(j);
			}
		}




	}
}
