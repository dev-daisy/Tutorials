package demo.linkedinlearning.java11;

import java.util.Scanner;

public class Functions {

	// a function must have a return date type
	// a function is a series of finite steps that accomplish some tak
	// functions help developers organize their code in a meaningful way
	// functions helps us define a single task once, so that it can be used all throughout our program.
	// functions make it easier to change what our code is doing
	// A function must be defined before it can be used. Defining it before the `main` function is the best way to do this.

	// A function encapsulates a single task. It can be called over and over again by using the function's name.

	// define a function
	// define outside the main function
	public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time");

        // input is a local variable inside this function
        // and cannot be accessed outside the functions of limitation
        // scope is limited to this function only
        Scanner input = new Scanner(System.in);

        input.next();
        System.out.println("It's developer tea time!");
    }


	// main function is where all of the flow of the program are executed
	// we can recall the other functions inside the main function
    public static void main(String[] args) {
        System.out.println("Welcome to your new job");

        //calling a function
        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        announceDeveloperTeaTime();

        System.out.println("Get promoted!");

    }
}
