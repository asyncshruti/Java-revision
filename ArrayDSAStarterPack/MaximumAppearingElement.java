import java.util.Arrays;

/**
 * Topic: Maximum Appearing Element
 * Task: You are given an integer array arr[], return the element which occurs maximum times. 
 * If multiple such elements exists return the maximum element.
 * Helper to write: maximumAppearingElement; accepts int[] left, int[] right, int maxValue and returns int.
 */
public class MaximumAppearingElement {
    public static void main(String[] args) {
        int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
        int result = mostFreqEle(arr);

        System.out.println("Expected output: 30");
        System.out.println("Your output: " + result);
    }

    private static int mostFreqEle(int[] arr) {
        Arrays.sort(arr);

        int count = 1;
        int maxCount = 1;
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                count++;
            }  
            else {
                if (count > maxCount) {
                    maxCount = count;
                    ans = arr[i - 1];
                }

                count = 1;
            }
        }

        return ans;
    }
}
