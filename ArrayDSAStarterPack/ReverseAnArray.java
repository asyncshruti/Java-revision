import java.util.Arrays;

/**
 * Topic: Reverse an Array
 * Task: Reverse the array in place and return the same array.
 * Helper to write: reverseAnArray; accepts int[] and returns int[].
 */
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = reverseAnArray(arr);

        System.out.println("Expected output: [5, 4, 3, 2, 1]");
        System.out.println("Your output: " + Arrays.toString(result));
    }

    private static int[] reverseAnArray(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        

        while (low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
        }
        
        return nums;
    }
}
