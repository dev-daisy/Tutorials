package demo.linkedinlearning.advancejava.generics;

public class Varargs {

	// Sometimes you might want to write a method that takes a variable number of arguments.
	// In Java there is a feature called variable-length arguments,
	// or varargs for short, which allows you to do this.

	public static void main(String[] args) {
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        //String[] shopping = {"Bread", "Milk", "Eggs", "Bananas" };
        printShoppingList(item1, item2, item3);
        // printShoppingList(shopping);
        printShoppingList("Bread", "Milk", "Eggs", "Bananas");
    }


	/*
    private static void printShoppingList(String str1, String str2) {
    	System.out.println("SHOPPING LIST");
    	System.out.println("1." + str1);
    	System.out.println("2." + str2);
    }


    // override the method with 3 parameters
    // method overriding
    private static void printShoppingList(String str1, String str2, String str3) {
        System.out.println("SHOPPING LIST");
    	System.out.println("1." + str1);
    	System.out.println("2." + str2);
    	System.out.println("3." + str3);

    }


    // override the method that prints each item in an Array
    // another method overriding
    private static void printShoppingList(String[] items) {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println();

    }
    */

    // method that uses varargs
    // replace String[] to String...
    // same functionality as above
    // using varargs, can pass 0 or more the 1 item as a parameter or array of items
    // above methods can be deleted and use this method instead
    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println();

    }

}
