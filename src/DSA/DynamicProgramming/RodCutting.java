package DSA.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class RodCutting {
    // recursive implementation
    public int rodcut_recursive(int n, int[] p){
        if(n==0)return 0;
        int maxprofit = Integer.MIN_VALUE;
        for (int l = 1; l<=n; l++){
            maxprofit = Math.max(maxprofit, p[l-1]+ rodcut_recursive(n-l, p));
        }
        return maxprofit;
    }

    // Dynamic programming implementation of rod cutting problem
    private Map<Integer, Integer> memo = new HashMap<>();
    public int rodcut_DP(int n, int[] p){
        int maxprofit = Integer.MIN_VALUE;
        if(n==0)return 0;
        if(memo.containsKey(n))return memo.get(n);
        for(int i = 1; i<=n; i++) {
            maxprofit = Math.max(maxprofit, p[i-1] + (rodcut_DP(n - i, p)));
        }
        memo.put(n, maxprofit);
        return maxprofit;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] p = {1,5,8,9,10,17,17,20,24,30};
        RodCutting rc = new RodCutting();
        System.out.println("Using Dynamic Programming: "+rc.rodcut_DP(n,p));
        System.out.println("Using Recursion: "+rc.rodcut_recursive(n,p));
    }
}
// I want to return actual solution stating which rod length has been cut to give the optimal solution.
