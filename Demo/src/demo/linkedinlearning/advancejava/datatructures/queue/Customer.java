package demo.linkedinlearning.advancejava.datatructures.queue;

// A queue is first in first out status structure,
// queues are useful if you are controlling access to shared resources.
// For example CPU scheduling or doing something like simulating planes
// waiting for landing instructions.

public class Customer {

	// fields
    private boolean hasBeenServed;
    private String name;


    // constructor
    public Customer(String name) {
        hasBeenServed = false;
        this.name = name;
    }

    public void serve() {
        hasBeenServed = true;
        System.out.println(name + " has been served");
    }

    // This is so that when I add customers to a queue
    // and then print the queue it will show me the customers name
    // rather than the objects reference.
    @Override
    public String toString(){
        return name;
    }
}
