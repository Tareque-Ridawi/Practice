import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading a string input
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        // Reading an integer input
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        // Reading a double input
        System.out.println("Enter your favorite number:");
        double favoriteNumber = scanner.nextDouble();

        // Displaying the inputs
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("Favorite Number: %.2f%n", favoriteNumber);

        // Closing the scanner
        scanner.close();
    }
}
