import java.util.Arrays;

/**
 * Topic: Left Rotate an Array by D Places
 * Task: Rotate arr left by d positions; handle d >= arr.length too.
 * Helper to write: leftRotateArrayByDPlaces; accepts int[] and int and changes arr in place.
 */
public class LeftRotateArrayByDPlaces {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        leftRotateArrayByDPlaces(arr, d);

        System.out.println("Expected output: [3, 4, 5, 1, 2]");
        System.out.println("Your output: " + Arrays.toString(arr));
    }

    private static void leftRotateArrayByDPlaces(int[] arr, int d) {
        ReverseArray(arr, 0, d - 1);
        ReverseArray(arr, d, arr.length - 1);
        ReverseArray(arr, 0, arr.length - 1);
    }

    private static void ReverseArray(int arr[], int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
