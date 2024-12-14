import java.util.Scanner;

public class DecimalOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a floating-point number:");
        double number = scanner.nextDouble();

        System.out.printf("Number up to 2 decimal points: %.2f%n", number);

        scanner.close();
    }
}
