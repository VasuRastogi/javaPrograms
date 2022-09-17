package DSA.dataStructures.Heap;

import java.util.Arrays;

public class HeapSort {
    public static void swap(int a, int b){
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
    }
    public static void max_Heapify(int []A, int i, int n){
//        this function takes an array and index i. it uses its operation from i'th index provided.
        int left = 2*i+1;
        int right = (2*i)+2;
        int largest = i;

        if(left<n  && A[left]>A[i]){
            largest = left;
        }
        else if (right<n && A[right]>A[i]){
            largest = right;
        }
        if (largest!=i){
            swap(A[largest], A[i]);
            max_Heapify(A,largest, n);
        }
    }
    static int heapSize;
    public static void build_max_Heap(int[]A){
        heapSize = A.length;
        for (int i=(A.length/2)-1; i>0; i--){
            max_Heapify(A, i, A.length);
        }
    }

    public static int[] heapSort(int[] A){
        build_max_Heap(A);
        for(int i = A.length-1; i>1; i--){
            swap(A[i], A[0]);
            heapSize = heapSize - 1;
            max_Heapify(A, 1, heapSize);
        }
        return A;
    }
    public static void main(String[] args) {
        int [] A = new int[]{1,2,3,17,19,36,7,25,100};
        System.out.println(Arrays.toString(heapSort(A)));
    }
}
