import java.util.Arrays;

/**
 * Topic: Remove Duplicates from a Sorted Array
 * Task: Put unique values at the front of arr and return their count.
 * Only the first returned-count elements are part of the result.
 * Helper to write: removeDuplicatesFromSortedArray; accepts int[] and returns
 * int.
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 30, 30, 30, 40 };
        int uniqueCount = removeDuplicatesFromSortedArray(arr);

        String actual = "count=" + uniqueCount + ", array="
                + Arrays.toString(Arrays.copyOf(arr, Math.max(0, Math.min(uniqueCount, arr.length))));

        System.out.println("Expected output: count=4, array=[10, 20, 30, 40]");
        System.out.println("Your output: " + actual);
    }

    private static int removeDuplicatesFromSortedArray(int[] arr) {
        int j = 1; // unique elements

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[j] = arr[i];
                j++;
            }
        }

        return j;
    }
}
