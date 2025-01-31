import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lab 1a");
        Scanner scanner = new Scanner(System.in);

        // Integer operations
        System.out.println("Enter a number (integer): ");
        int number1 = scanner.nextInt();
        System.out.println("Enter a second number (integer): ");
        int number2 = scanner.nextInt();

        System.out.println("You entered: " + number1 + " and " + number2);
        System.out.println("Addition: " + (number1 + number2));
        System.out.println("Subtraction: " + (number1 - number2));
        System.out.println("Multiplication: " + (number1 * number2));
        System.out.println("Division: " + (number1 / number2));
        System.out.println("Modulus: " + (number1 % number2));

        // Double operations
        System.out.println("\nEnter a number (double): ");
        double double1 = scanner.nextDouble();
        System.out.println("Enter a second number (double): ");
        double double2 = scanner.nextDouble();

        System.out.println("You entered: " + double1 + " and " + double2);
        System.out.println("Addition: " + (double1 + double2));
        System.out.println("Subtraction: " + (double1 - double2));
        System.out.println("Multiplication: " + (double1 * double2));
        System.out.println("Division: " + (double1 / double2));
        System.out.println("Modulus: " + (double1 % double2));

        scanner.close();
    }
}
