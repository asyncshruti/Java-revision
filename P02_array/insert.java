package P02_array;

public class insert {
    public static int insertElement(int[] arr, int n, int x, int cap, int pos) {
        if (n == cap)
            return -1;

        int idx = pos - 1;

        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }

        arr[idx] = x;
        return n + 1;
    }
}
