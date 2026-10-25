/**
 * Topic: Largest Element in an Array
 * Task: Return the largest value in the array.
 * Helper to write: largestElementInArray; accepts int[] and returns int.
 */
public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        int result = largestElementInArray(arr);

        System.out.println("Expected output: 20");
        System.out.println("Your output: " + result);
    }

    private static int largestElementInArray(int[] arr) {
        int maxEl = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (maxEl < arr[i]) {
                maxEl = arr[i];
            }
        }

        return maxEl;
    }
}
