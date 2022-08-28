package DSA.CLRS.DivideAndConquer.MaximumSubarrayProblem;
import java.util.Arrays;

public class maxSubarrayBruteForce{
    // using Linear bruteForce method to solve max sub-array problem.
    //Overall complexity is O(n^2)
    static int sum = Integer.MIN_VALUE;
    static int minIndex, maxIndex;

    public static int[] maxSubarray(int [] arr, int low, int high){
        for(int i = low; i<=high;i++){
            int tempsum = 0;
            for(int j = i; j<=high; j++){
                tempsum = tempsum + arr[j];
                if(tempsum>sum){
                    sum = tempsum;
                    minIndex = i;
                    maxIndex = j;
                }
            }
        }
        int[] ans = new int[]{minIndex, maxIndex, sum};
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{-2,-5,6,-2,-3,1,5,-6};
        System.out.println(Arrays.toString(maxSubarray(arr, 0, 7)));

    }
}


