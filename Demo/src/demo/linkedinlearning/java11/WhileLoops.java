package demo.linkedinlearning.java11;

import java.util.Scanner;

public class WhileLoops {

	// while loops
	// Check whether the condition is true; if it is true, then keep repeating until the condition is false.
	// A `while` loop keeps repeating a block of code as long as the condition evaluates to a true value.

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
            String userInput = input.next();

            if(userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
        input.close();
    }

}
