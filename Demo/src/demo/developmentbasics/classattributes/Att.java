package demo.developmentbasics.classattributes;

// attribute or variables
public class Att {

	// public visibility modifier means that attribute is visible to anybody, anywhere within the code base
	public int firstAttribute;
	// not necessary to assign a value to an attribute
	// secondAtrribute variable was initialized with a variable 5
	public int secondAttribute = 5;

	public String thirdAttribute;
	public String fourthAttribute = "default";

	// private visibility modifier means that attribute is only accessible within the class that it's defined in
	// if created a class method within this Att Class then it can access the private attribute
	// but an obj created outside thiAtt Class, it cannot access the private attribute
	// best practice is to define attributes as private and provide getters and setters
	// which allows other classes to set and retrieve values
	private int fifthAttribute;
	public int getFifthAttribute(){
		return fifthAttribute;
	}
	public void setFifthAttribute(int n){
		this.fifthAttribute = n;
	}

	// protected is a hybrid of public and private, it refers to an attribute that can be used by the package as a whole
	// and any subclasses within the package
	// but protected is not used often
	protected int sixthAttribute;

	// final is that the attribute cannot be overwritten
	// naming convention for final it to use UPPERCASE
	private final int SEVENTHATTRIBUTE = 7;
	public int getSeventhAttribute(){
		return this.SEVENTHATTRIBUTE;
	}

}
