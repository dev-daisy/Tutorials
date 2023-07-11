package demo.developmentbasics.classattributes;

import demo.commonsteps.CommonSteps;

public class Access {

	// main is a method
	public static void main(String[] args){

		Att obj = new Att();
		CommonSteps.printInt(obj.secondAttribute); // Print 5


		//System.out.println(obj.fifthAttribute); // Not accessible since it is private
		// uses getters and setters to access and manipulate private
		obj.setFifthAttribute(5);
		CommonSteps.printInt(obj.getFifthAttribute()); // Print 5

		// access object and manipulate them
		obj.sixthAttribute = 6;
		CommonSteps.printInt(obj.sixthAttribute); // Print 6

		obj.firstAttribute = 10;
		CommonSteps.printInt(obj.firstAttribute); // Print 10


		Att obj2 = new Att();
		CommonSteps.printInt(obj2.secondAttribute); // Print 5

		obj2.sixthAttribute = 6;
		CommonSteps.printInt(obj2.sixthAttribute); // Print 6

		CommonSteps.printInt(obj2.getSeventhAttribute()); //  Print 7

	}
}
