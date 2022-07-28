package Recursion;

// using an exponential time complexity algorithm to find Fibonacci numbers.
// won't work on large number e.g. 50.
// so, we use a different algo than this.
// complexity = (1.6)^n

public class fibonacci {
    public static void main(String[] args) {
        int ans = fibo(10);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
