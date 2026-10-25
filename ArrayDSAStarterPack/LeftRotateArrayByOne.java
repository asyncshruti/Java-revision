import java.util.Arrays;

/**
 * Topic: Left Rotate an Array by One
 * Task: Move the first element to the end, modifying arr in place.
 * Helper to write: leftRotateArrayByOne; accepts int[] and changes it in place.
 */
public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        leftRotateArrayByOne(arr);

        System.out.println("Expected output: [2, 3, 4, 5, 1]");
        System.out.println("Your output: " + Arrays.toString(arr));
    }

    private static void leftRotateArrayByOne(int[] arr) {
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;
    }
}
