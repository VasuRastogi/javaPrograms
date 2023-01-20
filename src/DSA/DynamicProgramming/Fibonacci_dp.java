package DSA.DynamicProgramming;
import java.util.HashMap;
import java.util.Map;
public class Fibonacci_dp {
    // memoization (Dynamic programming)
    /* Storing duplicate sub-problems */
    private Map<Integer, Integer> memoizeTable = new HashMap<>();

    public int fib(int n){
        if(n<=2)return 1;

        if(this.memoizeTable.containsKey(n)){
            return this.memoizeTable.get(n);
        }
        int result = fib(n-1)+ fib(n-2);

        this.memoizeTable.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        Fibonacci_dp obj = new Fibonacci_dp();
        System.out.println(obj.fib(50));
    }
}
