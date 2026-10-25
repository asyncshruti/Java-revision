/**
 * Topic: Second Largest Element in an Array
 * Task: Return the second-largest DISTINCT value. Return -1 if it does not
 * exist.
 * Helper to write: secondLargestElementInArray; accepts int[] and returns int.
 */
public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 20, 8, 20 };
        int result = secondLargestElementInArray(arr);

        System.out.println("Expected output: 10");
        System.out.println("Your output: " + result);
    }

    private static int secondLargestElementInArray(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (first < arr[i]) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        return second;
    }
}