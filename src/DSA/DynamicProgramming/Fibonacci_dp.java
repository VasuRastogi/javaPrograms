package DSA.DynamicProgramming;
import java.util.HashMap;
import java.util.Map;
public class Fibonacci_dp {
    // memoization (Dynamic programming)
    /* Storing duplicate sub-problems */

/*  Using top-down approach    */
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

/*  Using bottoms up approach   */
    public int fibB(int n){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        int ans = Integer.MIN_VALUE;
        for(int i=2; i<=n; i++){
            ans = map.get(i-1)+map.get(i-2);
            map.put(i, ans);
        }
        return map.get(n);
    }
    public static void main(String[] args) {
        Fibonacci_dp obj = new Fibonacci_dp();
        System.out.println("Using top down approach : "+obj.fib(8));
        System.out.println("Using bottoms up approach : "+obj.fibB(8));
    }
}
