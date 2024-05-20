import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two numbers from the user.
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        // Get the operator from the user.
        System.out.println("Enter the operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        // Perform the calculation.
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        // Print the result.
        System.out.println("The result is: " + result);
    }
}