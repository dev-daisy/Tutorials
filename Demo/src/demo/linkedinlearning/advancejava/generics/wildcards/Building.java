package demo.linkedinlearning.advancejava.generics.wildcards;

// Wildcards in Java can be useful in a variety of different situations.
// A wildcard is essentially an unknown type, and can give you more flexibility when writing methods.
// Wildcards can also be used to specify that super types can be used when a subtype is specified.

public class Building {

    public int numberOfRooms = 7;

    @Override
    public String toString() {
        return ("building");
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }


}
