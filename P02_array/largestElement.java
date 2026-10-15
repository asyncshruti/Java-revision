package P02_array;

public class largestElement {
/* 
    public int getlargest(int arr[]) {
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxval < arr[i]) {
                maxval = arr[i];
            }
        }
        return maxval;
    }


*/
// second largest element
    public static int secondLargest(int[] arr, int n) {
        int res = -1;       // stores index of second largest element
        int largest = 0;    // stores index of largest element

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                // If no second largest exists yet or current is greater than current second largest
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res;
    }
}
