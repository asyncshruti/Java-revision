/**
 * Topic: Maximum Subarray Sum
 * Task: Return the maximum sum of any non-empty contiguous subarray.
 * Helper to write: maximumSubarraySum; accepts int[] and returns int.
 */
public class MaximumSubarraySum {
    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = maximumSubarraySum(arr);

        System.out.println("Expected output: 6");
        System.out.println("Your output: " + result);
    }

    private static int maximumSubarraySum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(currSum, maxSum);

        }
        return maxSum;
    }

}
