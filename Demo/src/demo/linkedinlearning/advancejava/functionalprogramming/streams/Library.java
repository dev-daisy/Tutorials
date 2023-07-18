package demo.linkedinlearning.advancejava.functionalprogramming.streams;

import java.util.ArrayList;

// Streams provide a clean and simple way to iterate over a collection in Java.
// Instead of using a forEach loop, streams allow functional programming techniques to be used.
// These streams are not to be confused with input and output streams which are something completely different.


// forEach loop
// it uses something called external iteration
// Issues of using foreach loop:
// 1. Hard to write parallel iterations
// 2. Requires boilerplate code
// 3. Difficult to read meaning
// 4. Hard to abstract away from behavior

// streams, introduce in Java8
// solves the above issues
// it uses something called external iteration
// Next is the filter method
// 2 types of streams:
// lazy methods and eager methods.

// One of the advantages of using streams over using for loops,
// is that you can run iterations in parallel.

public class Library {

    public static void main(String[] args) {

        ArrayList<Book> books1 = populateLibrary();
        System.out.println(books1);

        // using a stream method
        ArrayList<Book> books = populateLibrary();

        // streams supports lambda
        // so uses lambda expression below
        // filter method in this example is a lazy method
        books.stream()
    	.filter(book -> {
    		return book.getAuthor().startsWith("J");
    	})
    	.filter(book -> {
    		return book.getTitle().startsWith("E");

    	})
    	// if below line will be remove, there will be no output
    	// because the above code is only to filter the stream
    	.forEach(System.out::println);


        // using parallel stream method
        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).forEach(System.out::println);
        // The difference of using parallel is in the speed of the performance.
        // Although it is very easy to use parallel streams,
        // this doesn't mean that you necessarily should.
        // Firstly, there is only really a performance impact
        // when you are using a very large amount of data.
        // If you only have a small dataset,
        // it might actually be more efficient to use a normal stream.
        // This code is also dependent on how many cores are available.
        // It is now common to have several cores you can utilize
        // but it's important to remember that it does depend on the machine I am running the code on.
        // In general, if I am performing the same operation over and over again on a huge dataset,
        // and I'm using a multi-core machine, then it is likely that I will see a
        // performance improvement by using parallel streams.

    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Toni Morrison", "Jazz"));
        books.add(new Book("Toni Morrison", "Paradise"));
        books.add(new Book("John Steinbeck", "The Grapes of Wrath"));
        books.add(new Book("John Steinbeck", "East of Eden"));
        books.add(new Book("Kazuo Ishiguro", "The Remains of the Day"));
        books.add(new Book("Kazuo Ishiguro", "Never Let Me Go"));
        books.add(new Book("Kazuo Ishiguro", "The Buried Giant"));
        books.add(new Book("Jane Austen", "Pride and Prejudice"));
        books.add(new Book("Jane Austen", "Emma"));
        books.add(new Book("Jane Austen", "Persuasion"));
        books.add(new Book("Jane Austen", "Mansfield Park"));
        books.add(new Book("Chinua Achebe", "Things Fall Apart"));
        books.add(new Book("Chinua Achebe", "No Longer at Ease"));
        books.add(new Book("Chinua Achebe", "Home and Exile"));
        return books;
    }

}
