package DSA.Sorting.LinearTimeBasedSorting;

import java.util.Arrays;

public class countSort {
    // non comparison linear time algorithm
    // assumes input to be a Whole number (0 to n)
    public int[] CountSort(int[]A){
        int k = findMax(A);
        int[] C = new int[k+1]; // make array up to max integer given. (0 till k)(so total numbers = k+1)

        // counting number of times values are repeated in A.
        for(int i =0; i<A.length; i++){
            // C's index will represent value of A
            C[A[i]]++;
        }
        // now create C(sum array) which will tell exact position in the output array
        for(int i=1; i<=k; i++){
            C[i] = C[i-1]+C[i];
        }
        // now c became c new.
        // now create an output array
        int[]B = new int[A.length];
        for(int i = A.length-1; i>=0; i--){   // reverse traversal to make the algo stable.
            B[C[A[i]]-1] = A[i];
            C[A[i]] = C[A[i]]-1;   // decrease count to assign space for duplicates
        }
        return B;
    }
    public static int findMax(int []arr){
        int max = 0;
        for (int i : arr)
            if (i>max)
                max = i;
        return max;
    }

    public static void main(String[] args) {
        int[]A = new int[]{5,4,3,2,1,8};
        System.out.println("....Works in linear time O(n+K)....");
        System.out.println("Without sort: "+Arrays.toString(A));
        countSort q = new countSort();
        System.out.println("With Count Sort: " + Arrays.toString(q.CountSort(A)));
    }
}
