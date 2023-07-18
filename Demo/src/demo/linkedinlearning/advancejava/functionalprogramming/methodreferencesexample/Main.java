package demo.linkedinlearning.advancejava.functionalprogramming.methodreferencesexample;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Square s = new Square(4);

        // Using Lambda
        Shapes shapes = (Square square) -> {
            return square.calculateArea();
        };
        System.out.println("Area: " + shapes.getArea(s));

        // Using Method reference
        Shapes shapes1 = Square::calculateArea;

        System.out.println("Area: " + shapes1.getArea(s));

    }

}
