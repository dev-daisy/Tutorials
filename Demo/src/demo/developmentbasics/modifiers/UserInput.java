package demo.developmentbasics.modifiers;

import java.util.Scanner;

import demo.commonsteps.CommonSteps;

public class UserInput {

	private String inp;

	public void getUserInput(){
		Scanner sc = new Scanner(System.in);
		CommonSteps.askStringInput();
		this.inp = sc.next();
	}

	public String getInp(){
		return inp;
	}
}
