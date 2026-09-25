package strings;

import java.util.Scanner;

public class strings {
    // String Declaration

    // String fullname = "ShrutiVelora";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("enter name" + name);

        String firstName = "Shruti";
        String lastName = "Velora";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.length());// prin.t length of a string

        // charAt---Access character of a string---
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
        // compare---
        String name1 = "Shruti";
        String name2 = "Shruti";

        // 1. s1 > s2 : +ve value
        // 2. s1 < s2 : -ve value
        // 3. s1 = s2 : 0

        if (name1.compareTo(name2) == 0) {
        System.out.println("Strings are equal");
        } else {
        System.out.println("Strings are not equal");
        }
        //do not use == to check for string equality
        //gives correct answer here
        if (name1 == name2) {
        System.out.println("Strings are equal");
        } else {
        System.out.println("Strings are not equal");
        }
        // Gives incorrect answer here---
        if (new String("shruti") == new String("shruti")) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
       

        // calculate substring
        String sentence = "ShrutiVelora";
        String name = sentence.substring(6);
        System.out.println(name);
    }
}
