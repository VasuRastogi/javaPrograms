package DSA.Sorting;
import java.util.Arrays;

// clrs implementation.
public class QuickSort {
    static int partition(int[] A, int p, int r){
        int pivot = A[r];
        int i = p-1;

        for(int j = p; j<r; j++){
            if(A[j]<=pivot){
                i++;
                swap(A, j, i);
            }
        }
        swap(A, i+1, r);
        return i+1;
    }
    public static void swap(int[]A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    void QuickSort(int[]A, int p, int r){
        if(p<r) {   // condition will break when block size remains 1 at p == r
            int q = partition(A, p, r);
            QuickSort(A, p, q - 1);
            QuickSort(A, q + 1, r);
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[]{1,25,8,9,0,4,5,6,6,55,8};
        System.out.println("Before: "+ Arrays.toString(arr));
        QuickSort q = new QuickSort();
        q.QuickSort(arr, 0, arr.length -1);
        System.out.println("After: "+Arrays.toString(arr));
    }
}