package Java.testingJava;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

class Solution {
    @Contract(pure = true)
    public static int @NotNull [] findMaximumSubarray(int @NotNull [] A) {
        int n = A.length;
        int maxSum = Integer.MIN_VALUE;
        int[] maxSubarray = new int[2];

        for (int i = 0; i < n; i++) {
            int currentSum = 0;

            for (int j = i; j < n; j++) {
                currentSum += A[j];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxSubarray[0] = i;
                    maxSubarray[1] = j;
                }
            }
        }
        return maxSubarray;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Arrays.toString(findMaximumSubarray(arr)));
    }
}
