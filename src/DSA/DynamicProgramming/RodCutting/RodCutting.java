package DSA.DynamicProgramming.RodCutting;

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
    public int rodcut_topdown(int n, int[] p){
        int maxprofit = Integer.MIN_VALUE;
        if(n==0)return 0;
        if(memo.containsKey(n))return memo.get(n);
        for(int i = 1; i<=n; i++) {
            maxprofit = Math.max(maxprofit, p[i-1] + (rodcut_topdown(n - i, p)));
        }
        memo.put(n, maxprofit);
        return maxprofit;
    }

    public int rodcut_bottomsup(int n, int[] p){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        for(int j = 0; j<n; j++){
            int maxProfit = Integer.MIN_VALUE;
            for (int i = 0; i<=j; i++){
                maxProfit = Math.max(maxProfit, p[i]+map.get(j-i));
            }
            map.put(j+1, maxProfit);
        }
        return map.get(n);
    }
    public static void main(String[] args) {
        int n = 10;
        int[] p = {1,5,8,9,10,17,17,20,24,30};
        RodCutting rc = new RodCutting();
        System.out.println("Using Top down approach of dp: "+rc.rodcut_topdown(n,p));
        System.out.println("Using Recursion: "+rc.rodcut_recursive(n,p));
        System.out.println("Using bottoms up approach of dp: "+rc.rodcut_bottomsup(n,p));
    }
}
// I want to return actual solution stating which rod length has been cut to give the optimal solution.
// It's solution will be present at extended bottom up rod cut solution.
