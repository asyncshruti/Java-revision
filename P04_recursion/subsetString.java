package P04_recursion;

import java.util.Scanner;

public class subsetString {
    public static void subsets(String s, String current, int i) {
        if (i == s.length()) {
            System.out.println(current);
            return;
        }

        subsets(s, current + s.charAt(i), i + 1);
        subsets(s, current, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        subsets(s, "", 0);
    }
}
