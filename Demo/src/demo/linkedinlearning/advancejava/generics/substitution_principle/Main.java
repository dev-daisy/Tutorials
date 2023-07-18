package demo.linkedinlearning.advancejava.generics.substitution_principle;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Building building = new Building();

        // Office is a sub type of the building
        // this is a substitution principle
        // this is not a subtype of a list of type Building
        Office office = new Office();
        build(building);
        build(office);

        // because of the substitution principle
        // can add office objects to the building list
        // because office is a subtype of a building
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildings(buildings);

        // creates a list of offices and adds some office objects to it
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        // If lists of type office were a subtype of lists of type building then
        // I would be able to call the print buildings method and pass in the list
        // However when I uncomment the below code I get a compile time warning
        // telling me that lists of type office and lists of type building are incompatible types.
        // So the substitution principle does not apply here
        // becuase the principle does not apply with types of lists
        //printBuildings(offices);

    }


    static void build(Building building) {
        System.out.println("Constructing a new " + building.toString());
    }

    // a method that takes a List<Building> as an arguments
    static void printBuildings(List<Building> buildings) {
        for(int i = 0; i < buildings.size(); i++) {
            System.out.println(i + 1 + ": " + buildings.get(i).toString());
        }
    }

}
