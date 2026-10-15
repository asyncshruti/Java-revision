package P04_recursion;

import java.util.Scanner;

public class SumSubset {
    public static int subsetSum(int[] arr, int n, int sum) {
        if (sum == 0) {
            return 1;
        }

        if (n == 0) {
            return 0;
        }
        if (arr[n - 1] > sum) {
            return subsetSum(arr, n - 1, sum);
        }
        int include = subsetSum(arr, n - 1, sum - arr[n - 1]);
        int exclude = subsetSum(arr, n - 1, sum);

        return include + exclude;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("length of set : " + n);
        int sum = sc.nextInt();
        System.out.println("sum :" +sum);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(arr);
        // int[] arr = { 2, 3, 5, 6, 8, 10 };
        // int target = 10;

        int result = subsetSum(arr, arr.length, sum);

        System.out.print(result);
    }

}
