package P04_recursion;
import java.util.Scanner;

public class RopeCutting {

    public static int maxPiece(int n, int a, int b, int c) { 
        if(n == 0) {
            return 0;    
        }

        if(n < 0) {
            return -1;
        }

        int result = Math.max(maxPiece((n - a), a, b, c), Math.max(maxPiece((n - b), a, b, c), maxPiece((n - c), a, b, c)));

        if (result == -1) {
            return -1;
        }

        return result + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total length: ");
        int n = sc.nextInt();

        System.out.print("Enter the first value ");
        int a = sc.nextInt();

        System.out.print("Enter the second value ");
        int b = sc.nextInt();

        System.out.print("Enter the third value ");
        int c = sc.nextInt();
        sc.close();

        System.out.println("Maximum pieces are : " + maxPiece(n, a, b, c));

    }
}
