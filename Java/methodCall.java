public class methodCall {

    // A void method: prints a welcome message (no return value)
    public static void printWelcome(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    // A non-void method: calculates the square of a number and returns it
    public static int square(int number) {
        return number * number;
    }

    // Method overloading: calculates the square of a double
    public static double square(double number) {
        return number * number;
    }

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width; // Non-void method
    }

    // Method to calculate the area of a square (method reuse)
    public static double calculateArea(double side) {
        return calculateArea(side, side); // Reusing the rectangle area method
    }

    public static void main(String[] args) {
        // Method invocation: calling the void method
        printWelcome("Alice");

        // Method invocation: calling non-void methods
        int squareOfInt = square(5); // Passing an int argument
        double squareOfDouble = square(3.5); // Passing a double argument

        // Printing results
        System.out.println("Square of 5: " + squareOfInt);
        System.out.println("Square of 3.5: " + squareOfDouble);

        // Method invocation: overloaded method reuse
        double rectangleArea = calculateArea(5.0, 3.0); // Rectangle
        double squareArea = calculateArea(4.0); // Square

        // Printing area results
        System.out.println("Area of rectangle (5.0 x 3.0): " + rectangleArea);
        System.out.println("Area of square (4.0 x 4.0): " + squareArea);
    }
}
