package DSA.DynamicProgramming.RodCutting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExtendedRodCut {
    public int[] ExtendedRC(int n, int[] p){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        int[]arr = new int[n];
        for(int j = 1; j<=n; j++){
            int maxProfit = Integer.MIN_VALUE;
            int maxvalueindex = 0;
            for (int i = 0; i<j; i++){
                if(maxProfit < p[i]+map.get(j-i-1)){
                    maxProfit = p[i] + map.get(j-i-1);
                    maxvalueindex = i;
                }
            }
            arr[j-1] = maxvalueindex+1; //+1 because i is starting from 0
            map.put(j, maxProfit);
        }
        int[] ans = new int[]{map.get(n), arr[n-1]};
        return ans;
    }
    public static void main(String[] args) {
        int n = 8;
        int[] p = {1,5,8,9,10,17,17,20,24,30};
        ExtendedRodCut rc = new ExtendedRodCut();
        System.out.println("Using extended bottoms up approach of dp: "+ Arrays.toString(rc.ExtendedRC(n,p)));
    }
}
