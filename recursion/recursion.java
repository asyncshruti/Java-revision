package recursion;

public class recursion {
    /* 
    //1. PRINT NUMBERS FROM 5 TO 1
    public static void printNumb(int n) {
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);
        
    }
    */
   
    /* 
    //2.PRINT SUM OF 1ST N NATURAL NUMBER--

    public static void calculateSum(int i, int n, int sum) {
            if(i ==n) {
                sum += i;
                System.out.println(sum);
                return;
            }
            sum += i;
            calculateSum(i +1, n, sum);
            System.out.println(i);
    }
    public static void main(String[] args) {
        calculateSum(1, 4, 0);
    }

    */

    /* 
    //3. FIND FACTORIAL OF NUMBER N 
    public static int factorial(int n){
        if(n==1 || n == 0){
            return 1;
        }
        int fact_n1 = factorial(n - 1);
        int fact_n = n* fact_n1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n=6;
        int ans = factorial(n);
        System.out.println(ans);
    }
    */
    /* 
    //4.   PRINT FIBONACCI SEQUENCE TILL NTH TERM

    public static void fibonacci(int a, int b, int n) {
        if(n ==0) {
         return ;
        }
        int c = a + b;
        System.out.println(c);
        fibonacci(b, c, n-1);
        
    }
    public static void main(String[] args) {
        int a =0;
        int b =1;
        System.out.println(b);
        int n = 6;
        fibonacci(a,b, n-2);
    }
    */

    //5.PRINT X^N---

    public static int calcPower(int x, int n) {
        if(n == 0){
            return 1;
        }
        if(x ==0) {
            return 0;

        }
        int xPower1 = calcPower(x, n-1);
        int xPower = x * xPower1;
        return xPower;
        
    }
    public static void main(String[] args) {
        int x = 2, n =5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
