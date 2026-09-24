package problem;
import java.util.*;

public class functions {
    /*
     * public static void printMyName(String name) {
     * //1. print name
     * System.out.println(name);
     * return;
     * }
     * public static void main(String[] args) {
     * 
     * Scanner sc = new Scanner(System.in);
     * String name = sc.next();
     * 
     * printMyName(name);
     */
    
    
    /*
     * // 2. add two number
     * 
     * public static int calculateSum(int a, int b) {
     * int sum = a + b;
     * return sum;
     * 
     * }
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int a = sc.nextInt();
     * int b = sc.nextInt();
     * 
     * int sum = calculateSum(a, b);
     * System.out.println(sum);
     * }
     */
    
    /* 
    //3.---MAKE A FUNCTION TO MULTIPLY 2 NUMBERS AND RETURN THE PRODUCT.----
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = multiply(a, b);
        System.out.println(product);
    }
        */

    //3. ----FACTORIAL----
     public static int factorial(int n) {
        if(n < 0) {
            System.out.println("Invalid number");
            return 0;
        }
        int factorial = 1;

        for( int i = n; i>= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int fact = factorial(n);
        System.out.println(fact);
    }
}
