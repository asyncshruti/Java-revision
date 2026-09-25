package strings;

import java.util.Scanner;

public class strings {
    // String Declaration
    // String fullname = "ShrutiVelora";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // String name = sc.nextLine();
        // // System.out.println("enter name" + name);

        // String firstName = "Shruti";
        // String lastName = "Velora";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName.length());// prin.t length of a string

        // // charAt---Access character of a string---
        // for (int i = 0; i < fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
        // }

        // // compare---
        // String name1 = "Shruti";
        // String name2 = "Shruti";

        // // 1. s1 > s2 : +ve value
        // // 2. s1 < s2 : -ve value
        // // 3. s1 = s2 : 0

        // if (name1.compareTo(name2) == 0) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }


        // //do not use == to check for string equality
        // //gives correct answer here

        // if (name1 == name2) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // // Gives incorrect answer here---
        
        // if (new String("shruti") == new String("shruti")) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }
       

        // // calculate substring
        // String sentence = "ShrutiVelora";
        // String name = sentence.substring(6);
        // System.out.println(name);

        // StringBuilder sb = new StringBuilder("shruti");
        // System.out.println(sb);

        // //char at index 0 
        // System.out.println(sb.charAt(0));

        // //set char at index 0
        // sb.setCharAt(0, 'p');
        // System.out.println(sb);

        // // insert char
        // sb.insert(0, 'S');
        // System.out.println(sb);

        // //delete char
        //  sb.delete(1, 2);
        //  System.out.println(sb);

        //append ---
        StringBuilder sb = new StringBuilder("hello");
        // sb.append("h"); //str = str +"h"
        // sb.append("r");
        // sb.append("u");
        // sb.append("t");
        // sb.append("i");
        // System.out.println(sb.length());
        // System.out.println(sb);

        //reverse string
        for(int i =0; i <sb.length()/2; i++) {
            int front = i;
            int back = sb.length() -1 - i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }

}
