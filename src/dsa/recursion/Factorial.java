package dsa.recursion;

public class Factorial {
    public static void main(String[] args) {
       int res = fact(-1);
        System.out.println(res);
    }

    public static int fact(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
