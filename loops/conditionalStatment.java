package loops;

import java.util.*;

public class conditionalStatment {
    // p1 ----if-else statement

    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int age = sc.nextInt();
     * 
     * if (age > 18) {
     * System.out.println("Adult");
     * } else {
     * System.out.println("not Adult");
     * }
     * }
     */
    /*
     * //P2 --- else if else
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int a = sc.nextInt();
     * int b = sc.nextInt();
     * 
     * if (a == b) {
     * System.out.println("a equal b");
     * }
     * else if(a > b) {
     * System.out.println("a is greater than b");
     * }
     * else {
     * System.out.println("a is lesser than b");
     * }
     * }
     */

    // p3---Switch Break
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjor");
                break;
            default:
                System.out.println("Invalid Button");
        }

        sc.close();
    }

}
