package DSA.Sorting;

import java.util.Arrays;

public class insertionSort {
    // Implementation of insertion sort

    //make an insertion sort function
    static void insertionFunction(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[]args){
            //initialize
            int [] ar = new int []{1,5,6,4,3,2,7,4};
            insertionFunction(ar);
            System.out.println(Arrays.toString(ar));
    }
}

