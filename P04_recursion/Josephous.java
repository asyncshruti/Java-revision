package P04_recursion;

import java.util.Scanner;

public class Josephous {
    public static int josephous(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (josephous(n - 1, k) + k) % n;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the number :" + n);
        int k = sc.nextInt();
        System.out.println("enter a eliminating number :" + k);
        System.out.println("last surviving element " + josephous(n, k));

    }
}
