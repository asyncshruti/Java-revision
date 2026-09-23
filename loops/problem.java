
//------Calculator----//
package loops;
import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1 : Addition (+)");
        System.out.println("2 : Subtraction (-)");
        System.out.println("3 : Multiplication (*)");
        System.out.println("4 : Division (/)");
        System.out.println("5 : Modulo (%)");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Result = " + result);
                break;

            case 2:
                result = a - b;
                System.out.println("Result = " + result);
                break;

            case 3:
                result = a * b;
                System.out.println("Result = " + result);
                break;

            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            case 5:
                if (b != 0) {
                    result = a % b;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Cannot find modulo with zero.");
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
    
    
