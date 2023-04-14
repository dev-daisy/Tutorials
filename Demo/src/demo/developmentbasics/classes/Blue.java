package demo.developmentbasics.classes;

// Inheritance uses extends keyword
// In Java, you can only inherit from one class, so a single inheritance
// We can't extend from multiple different classes
public class Blue extends Color {

	public void temperature(){
		System.out.println("cold");
	}

	public static void main(String[] args){
		Blue blue = new Blue();
		blue.temperature();
	}
}
