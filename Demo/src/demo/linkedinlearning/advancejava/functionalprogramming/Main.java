package demo.linkedinlearning.advancejava.functionalprogramming;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    	// new instance of the GreetingMessage method instance implementation
        GreetingMessage gm = new GreetingMessage() {

        	// compiler added the override version of the greeting method
        	// Because greeting message has an abstract method with no implementation,
        	// I have to add my own every time I create a new instance of greeting message.
            // This is also known as an anonymous in a class.

        	@Override
        	//public void greet(String name) {
            //    throw new UnsupportedOperationException("Not Supported yet.");
            //}


        	// I will replace compiler  automatic implementation with a print statement
        	// that prints out hello and the name that was passed in.
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };

        gm.greet("Bethan");

        // That is all the functional interface is.
        // It allows Java programmers to pass code around as data.
        // At the moment, the codes to implement my functional interface is quite long
        // and messy considering all it does is provide one new line of functionality.

        // Lamdas were introduced to improve this.


        // ------------------------------------------------------
        // Using Lambda


    	// can be implemented like this also
        //GreetingMessage gm2 =  (name) -> {}

        // if there are more than one argument
        // GreetingMessage gm2 =  (String name, String str) -> {}

        // for the sake of readability
        GreetingMessage gm2 =  (String name) -> {
            System.out.println("Hello " + name);
        };

        gm2.greet("Bethan");

        // However when I use the lambda I used less code.
        // I didn't need to create a new greeting message
        // or write out the whole body of the method again.

        // Nothing in the brackets because the method takes no argument
        MessagePrinter mp = () -> {
            System.out.println("This is a message");
        };
        mp.printMessage();


        // So lambdas are a quick and simple way of implementing functional interfaces,
        // they look quite different to anonymous inner classes,
        // but the logic is the same and is easy to understand
        // when you are used to reading the syntax.

        // ------------------------------------------------------

    }


}
