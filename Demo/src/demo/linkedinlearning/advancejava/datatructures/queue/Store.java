package demo.linkedinlearning.advancejava.datatructures.queue;

import java.util.ArrayList;
import java.util.LinkedList;


public class Store {

    public static void main(String[] args) {

    	// There are several classes in the JAVA API that implements the queue interface.
    	// One of these classes is linked list, which I am using for this example.
        LinkedList<Customer> queue = new LinkedList();


        // added new element to the queue
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);

        // Queues are a useful way of applying constraints in situations like this
        // where you want the first item in the queue to be the one that gets removed first.

    }


    // static void method
    // Which takes a linked list containing customers called queue as an argument
    // I want this to behave like a real customer being served in a real store
    // When a customer has been served they should be removed from the queue and
    // it should always be the first person who joins the queue that gets served first.
    static void serveCustomer(LinkedList<Customer> queue) {

    	// When a customer has been served they should be removed from the queue
    	// and it should always be the first person who joins the queue that gets served first.
    	Customer c = queue.poll();
        c.serve();

    }

}
