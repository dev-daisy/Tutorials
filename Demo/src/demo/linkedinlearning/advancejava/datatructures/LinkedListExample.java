package demo.linkedinlearning.advancejava.datatructures;

import java.util.LinkedList;

//  Collections are an essential part of the Java programming language.
//  They let you group objects together, in a container, which you can iterate over, in Java.

// Factors to consider when using
// Ordering :
//     It is important to be able to access them in a specific order.
// Duplicates:
//     There are some situations where it is fine to have duplicate entries, and others,
//     when every entry should be different.
// Performance during operation:
//     Some are quick at retrieving entries.
//     Some are quicker at adding and removing them.
// Memory Used:
//     Some types of collections take up more memory than others.
//     A useful resource for choosing which collection to use is a flow chart available at this link
//     wwww.sergiy.ca/guide-to-selecting-appropriate-map-collection-in-java

// Collection Types:
// 1st : Iterable
//		- All types of collection implement Iterable, and it declares the forEach method.
// 2nd : Collection Interface
//		- Extends Iterable
//		- This interface declares all of the methods that every collection must have.
// 3rd : Layer of Interface - These interfaces define a more specific set of behaviors about how the collection behaves.
//		- Set -> are a type of collection that do not allow duplicate elements.
//			  -> They are also unordered.
//  		  -> ex:  if you are making a card game, and wanted to ensure that there are no duplicate cards in the game, you could store them in a set.
//		- List -> on the other hand, allow duplicate entries.
//			   -> The order of elements in a list is also significant.
//			   -> When you iterate over a list, the items are not returned in a random order
//		- Queue -> are a type of collection that lets you add elements to the heads of the collection.
//				-> They typically use first-in, first-out operations.
//				-> They are a bit like real life queues in a store, where the first person to arrive is the first person to be served.
//				-> First come first serve
//		- Maps -> Does not extend Collection interface
//			   -> Key-Value Pair


// A linked list is a doubly linked collection of elements.
// Each entry in the list also holds a reference to the address of the next and the previous item in the list.
// The main advantage of using a linked list is that they are very quick for inserting and removing elements in the middle of a list.

public class LinkedListExample {

	public static void main(String[] args) {

		// in Angle Bracket, there's list of strings
        LinkedList<String> myList = new LinkedList();

        // add new element to myList
        myList.add("A");
        myList.add("B");

        // insert element to an specific index using add wih argument 1
        myList.add(1, "C");
        System.out.println(myList);

        // parse the leter B
        myList.remove("B");
        System.out.println(myList);

    }

	// Linked Lists are often compared to array lists
	// because they both implement the list interface and
	// so they have lots of methods in common

	//-------------------------------------------
	// Linked Lists vs Array Lists

	// If I wanted to insert lots of elements in the middle of the list,
	// or remove lots of elements from the middle,
	// it would be faster to use linked list.
	// Linked lists also take up more memory than array lists
	// because in a linked list each entry contains a reference to elements in the list
	// and also to the next and previous elements.

	// On the other hand, if I wanted to get elements from the list,
	// then an array list would be much faster.
	// For most cases, if you have to choose between array list and linked list,
	// the better choice is array list.

	// If you are in doubt, use an array list,
	// but if you know that you will need to add or remove lots of elements in the middle,
	// then a linked list is the better option.
	//-------------------------------------------
}
