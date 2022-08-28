package DSA.CLRS.DivideAndConquer.MaximumSubarrayProblem;

import java.util.Arrays;

//kadane algorithm is a way to solve max sub-array problem without recurrence.
// Overall Complexity is O(n) i.e. linear time complexity.
public class KadaneAlgorithm {
    public static int kadane(int[] arr, int high, int low){
        int tempSum = 0;
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i<=arr.length-1; i++){
            tempSum = tempSum + arr[i];
            if(tempSum>sum){
                sum = tempSum;
            }
            if(tempSum<0){        // discarding value that is overall negative in nature.
                tempSum = 0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{-2, -5, 6, -2, -3, 1, 5, -6};
        System.out.println(kadane(arr, 7, 0));
    }
}
