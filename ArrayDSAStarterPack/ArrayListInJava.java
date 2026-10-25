import java.util.ArrayList;

//import strings.strings;

/**
 * Topic: ArrayList in Java
 * Task: Build an ArrayList from values, add 50, change index 1 to 25,
 * then remove the value 30. Explore add(), set(), remove(), get(), contains(),
 * and size().
 * Helper to write: arrayListInJava; accepts int[] and returns
 * ArrayList<Integer>.
 */
public class ArrayListInJava {
    public static void main(String[] args) {
        int[] values = { 10, 20, 30, 40 }; // Hardcoded test input

        // Call your helper. Write its declaration and logic yourself inside this class.
        ArrayList<Integer> result = arrayListInJava(values);

        System.out.println("Expected output: [10, 25, 40, 50]");
        System.out.println("Your output: " + result);
    }

    private static ArrayList<Integer> arrayListInJava(int[] values) {
        ArrayList<Integer> shruti = new ArrayList<>();

        for (int num : values) {
            shruti.add(num);
        }

        shruti.add(50);
        shruti.set(1,25);
        shruti.remove(2);

        return shruti;
    }
    
}
