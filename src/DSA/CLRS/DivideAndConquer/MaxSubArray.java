package DSA.CLRS.DivideAndConquer;

import java.util.Arrays;

public class MaxSubArray {
    public static int[] Find_Max_Crossing_Subarray(int [] arr, int low, int high, int mid){
        int leftSum = Integer.MIN_VALUE;
        int localSum = 0;
        int maxLIndex = 0;
        for (int i = mid; i>=low; i--){
            localSum = localSum +arr[i];
            if(leftSum<localSum){
                leftSum = localSum;
                maxLIndex = i;
            }
        }
        int RightSum = Integer.MIN_VALUE;
        int RightLocalSum = 0;
        int maxRIndex = 0;
        for (int j = mid+1; j<=high; j++){
            RightLocalSum = RightLocalSum +arr[j];
            if(RightLocalSum>RightSum){
                RightSum = RightLocalSum;
                maxRIndex = j;
            }
        }
        int[] ans = new int[]{maxLIndex,maxRIndex, RightSum+leftSum};
        return ans;
    }
    public static int[] Find_Max_Subarray(int[] arr, int low, int high){

        int mid = (low + ((high-low)/2));
        if(low == high){   // for one element
            int [] locAns = new int[]{low, high, arr[(low+high)/2]};
            return (locAns);
        }

        int[] a = Find_Max_Subarray(arr, low, mid);                   // For Left Half.
        int[] b = Find_Max_Subarray(arr, mid+1, high);           // For Right Half.
        int[] c = Find_Max_Crossing_Subarray(arr, low, high, mid);   // For centre Crossing.


        if(a[2]>=b[2] && a[2]>=c[2]){         // if left sum > right sum and cross sum
            return a;
        }
        else if(b[2]>a[2] && b[2]>c[2]){
            return b;
        }
        else return c;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{-2, -5, 6, -2, -3, 1, 5, -6};
        System.out.println(Arrays.toString(Find_Max_Subarray(arr, 0, 7)));
    }
}