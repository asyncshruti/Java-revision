/**
 * Topic: Check if an Array is Sorted
 * Task: Return true for non-decreasing order; otherwise return false.
 * Helper to write: checkIfArrayIsSorted; accepts int[] and returns boolean.
 */
public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 30, 40 };
        boolean result = checkIfArrayIsSorted(arr);

        System.out.println("Expected output: true");
        System.out.println("Your output: " + result);
    }

    private static boolean checkIfArrayIsSorted(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
