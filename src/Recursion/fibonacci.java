package Recursion;

// using an exponential time complexity algorithm to find Fibonacci numbers.
// won't work on large number e.g. 50.
// so, we use a different algo than this.
// complexity = (1.6)^n

public class fibonacci {
    public static void main(String[] args) {
        int ans = fibo(5);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);      // here we have used recurssion relation;
    }
}

/*
  if we solve this linear recurssive relation, we will get a relation:
  (1/sqrt(5))*((1+sqrt(5)/2)**n - (1/sqrt(5))*((1-sqrt(5)/2)**n
*/