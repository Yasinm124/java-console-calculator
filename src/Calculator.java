import java.util.Scanner;

public class Calculator {

    // Method for Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for Division with error handling
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // return NaN for invalid division
        }
        return a / b;
    }
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // to read user input
        boolean flag = true; // flag to control loop

        System.out.println("------Java Console Calculator------");

        // Loop until user chooses to exit
        while (flag) {
            // Display menu
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Exit condition
            if (choice == 5) {
                System.out.println("Exiting calculator...!");
                flag = false;
                continue; // skip rest of loop
            }

            // Get numbers from user
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result; // variable to store result

            // Perform operation based on choice
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) { // print only if valid
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("1Invalid choice");
            }
        }
        scanner.close(); 
    }
}