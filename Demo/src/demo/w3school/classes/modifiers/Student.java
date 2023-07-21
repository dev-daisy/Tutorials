package demo.w3school.classes.modifiers;

//Subclass (inherit from Second)
class Student extends Second {
	public int graduationYear = 2018;
	public void study() { // the body of the abstract method is provided here
		System.out.println("Studying all day long");
	}
}
//End code from filename: Second.java