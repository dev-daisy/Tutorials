package demo.linkedinlearning.advancejava.generics.wildcards;

import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args) {

        // List of buildings
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);

        //------------------------------------
        // cannot pass either of these lists into the printBuilding methods.
        // Because the list of type office is not a subtype of a list of type building.
        // And nor is a list of type house.

        // List of offices
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);

        // List of houses
        List<House> houses = new ArrayList();
        houses.add(new House());
        houses.add(new House());
        printBuildings(houses);

        // solution:
        // quicker and simpler solution is to use wildcards.
        //  To use a wildcard,
        // I put a question mark and then write extends.


        //---------------------------------

        // pass in a list of buildings to this method, because building is a super type of House.
        addHouseToList(houses);
        addHouseToList(buildings);


        // when to use extends and when to use super with wildcards,
        // you can think about invariables and outvariables.

    }


    // That takes a list of buildings as a parameter, and prints them to the terminal.
    // not uses a wildcard
    // static void printBuildings(List<Building> buildings) {

    // uses a wildcard
    // This means that I can now pass in lists of any type that extends the building class.
    // I am passing in a list which provides data which I use inside the method
    // invariable - it makes sense to use extends.
    // Upper Bounded Wildcards
    static void printBuildings(List<? extends Building> buildings) {
            for(int i = 0; i < buildings.size(); i++) {
            System.out.println(buildings.get(i).toString() + " " + (i + 1));
        }
        System.out.println();
    }


    // a method called addHouseToList, which takes a list of houses as an argument and adds a new house to it.
    // Currently, I can only pass in a list of houses to this method.
    // static void addHouseToList(List<House> buildings) {

    // But if I wanted to be able to pass in a list of Buildings, I can use wildcards again.
    // using the method to give additional data by adding to the list
    // outvariable - it makes sense to use super
    // Lower Bounded wildcard
    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());
        System.out.println();
    }

    // Note that it is generally a bad idea to
    // use wildcards as return types for a method.
    // If I did this, anyone else who used these methods
    // would have to spend time working out the hierarchies in my code.
    // In the case where the code needs to access the variable as both an "in" and an "out" variable, do not use a wildcard.


}
