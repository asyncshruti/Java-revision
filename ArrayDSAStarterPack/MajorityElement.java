import java.util.Arrays;

/**
 * Topic: Majority Element
 * Task: Return the element occurring more than n / 2 times; return -1 if no
 * majority exists.
 * Helper to write: majorityElement; accepts int[] and returns int.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 8, 8, 6, 6, 6, 4, 6, 6 };
        int result = majorityElement(arr);

        System.out.println("Expected output: 6");
        System.out.println("Your output: " + result);
    }

    private static int majorityElement(int[] arr) {
        Arrays.sort(arr);

        int count = 1;
        int maxcount = 1;
        int ans = arr[0];

        // 30 30 30 40 40 50 50 50 50

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (maxcount < count) {
                    maxcount = count;
                    ans = arr[i - 1];
                }
                count = 1;
            }
        }

        // ans is the most frequent element
        count = 0;
        int n = arr.length;
        for (int num : arr) {
            if (num == ans) {
                count++;
            }
        }

        if (count < n / 2) {
            return -1;
        }
        return ans;
    }
}
