import java.util.Arrays;

/**
 * Topic: Move Zeros to End
 * Task: Move zeros to the end while preserving the order of non-zero values.
 * Helper to write: moveZerosToEnd; accepts int[] and changes it in place.
 */
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {8, 5, 0, 10, 0, 20, 0};
        moveZerosToEnd(arr);

        System.out.println("Expected output: [8, 5, 10, 20, 0, 0, 0]");
        System.out.println("Your output: " + Arrays.toString(arr));
    }

    private static void moveZerosToEnd(int[] arr) {
        int j = 0; // non-zero element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                Swap(arr, i, j);
                j++;
            }
        }
    }

    private static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
