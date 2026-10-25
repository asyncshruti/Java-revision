/**
 * Topic: Longest Even Odd Subarray
 * Task: Return the length of the longest contiguous subarray where even and odd values alternate.
 * Helper to write: longestEvenOddSubarray; accepts int[] and returns int.
 */
public class LongestEvenOddSubarray {
    public static void main(String[] args) {
        int[] arr = {10, 12, 14, 7, 8, 10, 13};
        int result = longestEvenOddSubarray(arr);

        System.out.println("Expected output: 3");
        System.out.println("Your output: " + result);
    }

    private static int longestEvenOddSubarray(int[] arr) {
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 != arr[i - 1] % 2) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }

        return maxCount;
    }
}
