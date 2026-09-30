package recursion;

public class recursion {
    /*
     * //1. PRINT NUMBERS FROM 5 TO 1
     * public static void printNumb(int n) {
     * if(n == 0){
     * return;
     * }
     * System.out.println(n);
     * printNumb(n-1);
     * 
     * }
     */

    /*
     * //2.PRINT SUM OF 1ST N NATURAL NUMBER--
     * 
     * public static void calculateSum(int i, int n, int sum) {
     * if(i ==n) {
     * sum += i;
     * System.out.println(sum);
     * return;
     * }
     * sum += i;
     * calculateSum(i +1, n, sum);
     * System.out.println(i);
     * }
     * public static void main(String[] args) {
     * calculateSum(1, 4, 0);
     * }
     * 
     */

    /*
     * //3. FIND FACTORIAL OF NUMBER N
     * public static int factorial(int n){
     * if(n==1 || n == 0){
     * return 1;
     * }
     * int fact_n1 = factorial(n - 1);
     * int fact_n = n* fact_n1;
     * return fact_n;
     * }
     * public static void main(String[] args) {
     * int n=6;
     * int ans = factorial(n);
     * System.out.println(ans);
     * }
     */
    /*
     * //4. PRINT FIBONACCI SEQUENCE TILL NTH TERM
     * 
     * public static void fibonacci(int a, int b, int n) {
     * if(n ==0) {
     * return ;
     * }
     * int c = a + b;
     * System.out.println(c);
     * fibonacci(b, c, n-1);
     * 
     * }
     * public static void main(String[] args) {
     * int a =0;
     * int b =1;
     * System.out.println(b);
     * int n = 6;
     * fibonacci(a,b, n-2);
     * }
     */
    /*
     * //5.PRINT X^N---
     * 
     * public static int calcPower(int x, int n) {
     * if(n == 0){
     * return 1;
     * }
     * if(x ==0) {
     * return 0;
     * 
     * }
     * int xPower1 = calcPower(x, n-1);
     * int xPower = x * xPower1;
     * return xPower;
     * 
     * }
     * public static void main(String[] args) {
     * int x = 2, n =5;
     * int ans = calcPower(x, n);
     * System.out.println(ans);
     * }
     * 
     */
    /*
     * public static void towerOfHanoi(int n, String src, String helper, String
     * dest) {
     * if(n==1) {
     * System.out.println("transfer disk" + n + "from " +src + "to" +dest);
     * return;
     * }
     * towerOfHanoi(n-1, src, dest, helper);
     * System.out.println("transfer disk" + n + "from " +src + "to" +dest);
     * towerOfHanoi(n-1, helper, src, dest);
     * 
     * }
     * public static void main(String[] args) {
     * int n = 3;
     * towerOfHanoi(n, "S", "H", "D");
     * }
     * 
     */
    /*
     * public static void printRev(String str, int idx) {
     * if(idx == 0) {
     * System.out.println(str.charAt(idx));
     * return;
     * }
     * System.out.print(str.charAt(idx));
     * printRev(str, idx - 1);
     * }
     * public static void main(String[] args) {
     * String str = "abcd";
     * printRev(str, str.length() - 1);
     * }
     */

    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        findOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abcaacbafaah";
        findOccurance(str, 0, 'a');
    }

}
