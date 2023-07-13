package demo.linkedinlearning.advancejava.substitution_principle;


// The substitution principle, which is also known as
// the Liskov Substitution Principle is an important concept
// in object-oriented programming because it allows you to write
// maintainable and reusable code.
// The substitution principle lets you assign variables of a given type to the subtype
// but the principle does not apply with types of lists.

public class Building {

    @Override
    public String toString() {
        return("building");
    }

}
