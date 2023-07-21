package demo.w3school.classes.innerclasses;

class OuterClass {
	  int x = 10;

	  // Java Inner Classes
	  // In Java, it is also possible to nest classes (a class within a class).
	  // The purpose of nested classes is to group classes that belong together,
	  // which makes your code more readable and maintainable.
	  class InnerClass {
	    int y = 5;
	  }

	  // Private Inner Class
	  // Unlike a "regular" class, an inner class can be private or protected.
	  // If you don't want outside objects to access the inner class, declare the class as private:
	  private class InnerClass2 {
		    int y = 5;
	  }

	  // Static Inner Class
	  // An inner class can also be static, which means that you can access it without creating an object of the outer class:
	  static class InnerClass3 {
		    int y = 5;
	  }

	  // Access Outer Class From Inner Class
	  // One advantage of inner classes, is that they can access attributes and methods of the outer class:
	  class InnerClass4 {
		    public int myInnerMethod() {
		      return x;
		    }
	  }
}

public class Main {
	  public static void main(String[] args) {

		    OuterClass myOuter = new OuterClass();

		    OuterClass.InnerClass myInner = myOuter.new InnerClass();
		    System.out.println(myInner.y + myOuter.x);

		    // error: OuterClass.InnerClass has private access in OuterClass
		    // OuterClass.InnerClass2 myInner2 = myOuter.new InnerClass2();
		    // System.out.println(myInner2.y + myOuter.x);

		    OuterClass.InnerClass3 myInner3 = new OuterClass.InnerClass3();
		    System.out.println(myInner3.y);

		    OuterClass.InnerClass4 myInner4 = myOuter.new InnerClass4();
		    System.out.println(myInner4.myInnerMethod());

	  }

}

// Outputs 15 (5 + 10)