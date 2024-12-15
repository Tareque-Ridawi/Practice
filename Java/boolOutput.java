import java.util.Scanner;

public class boolOutput {

    // Method to check if a number is positive (method call & relational operator)
    public static boolean isPositive(int number) {
        return number > 0; // Relational operator '>'
    }

    // Method to check if a number is even (method call & logical expressions)
    public static boolean isEven(int number) {
        return number % 2 == 0; // Relational operator '%' and comparison
    }

    // Method to evaluate a complex logical expression
    public static boolean isInRange(int number, int lowerBound, int upperBound) {
        return number >= lowerBound && number <= upperBound; // Relational and logical operators
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Relational operators and boolean type demonstration
        boolean positive = isPositive(number);
        boolean even = isEven(number);

        // Method calls and logical expressions
        boolean inRange = isInRange(number, 1, 100);

        // Display results
        System.out.println("Is the number positive? " + positive); // Boolean type output
        System.out.println("Is the number even? " + even);
        System.out.println("Is the number between 1 and 100? " + inRange);

        // Combining logical expressions
        if (positive && even) {
            System.out.println("The number is both positive and even.");
        } else if (positive || even) {
            System.out.println("The number is either positive or even.");
        } else {
            System.out.println("The number is neither positive nor even.");
        }

        scanner.close(); // Close the scanner
    }
}
