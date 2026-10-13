package P04_recursion;

import java.util.Scanner;

public class Pallindrome {
    public static boolean fun(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        return (str.charAt(start) == str.charAt(end));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String str = sc.nextLine();
        System.out.println(fun(str, 0, str.length() - 1));
    }
}
