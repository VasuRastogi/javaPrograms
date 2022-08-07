package Java.testingJava;

import java.util.Arrays;

public class Sol {
//    trying merge sort
    static void swap(int i, int j){
        int temp = j;
        i = j;
        j = temp;
    }
    static void sort(int[]arr){
        int start_index = 0;
        int end_index = arr.length-1;
        int mid_index = start_index + (end_index - start_index)/2;

        int n1 = mid_index - start_index + 1;
        int n2 = end_index - mid_index;

        int[] LSA = {};
        int[] RSA = {};

        for(int i=0; i<n1;i++){
            LSA[i] = arr[start_index + i];
        }
        for(int j = 0; j<n2; j++){
            RSA[j] = arr[mid_index + j];
        }
    }

    public static void main(String[] args) {
        int[]arr = new int[]{5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

