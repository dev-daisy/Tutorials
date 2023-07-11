package demo.developmentbasics.modifiers;

import demo.commonsteps.CommonSteps;

public class Main {

	public static void main(String[] args){

		UserInput ui = new UserInput();
		ui.getUserInput();
		String input = ui.getInp();
		String reversedString = StringReverser.reverser(input);
		CommonSteps.printString(reversedString);

	}
}
