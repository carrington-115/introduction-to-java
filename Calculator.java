import java.util.Scanner;

public class Calculator {
    // calculator methods
    double add(double x, double y) {
        return x + y;
    }

    void divide(double x, double y) {
        if (y != 0) {
            System.out.println(x / y);
        } else {
            System.err.println("Division by zero is not possible");
        }

    }

    double multiply(double x, double y) {
        return x * y;
    }

    double subtract(double x, double y) {
        return (x - y);
    }

    public static void main(String[] args) {
        // getting the user input
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String operation = sc.next();

        switch (operation) {
            case "+":
                double addResult = calculator.add(x, y);
                System.out.println("Addition result: " + addResult);
                break;
            case "-":
                double subResult = calculator.subtract(x, y);
                System.out.println("Subtraction result: " + subResult);
                break;

            case "*":
                double mulResult = calculator.multiply(x, y);
                System.out.println("Multiplication result: " + mulResult);
                break;

            case "/":
                calculator.divide(x, y);
                break;

            default:
                System.err.println("You entered a wrong value. enter either +, -, /, or *");

        }

        sc.close();

    }
}
