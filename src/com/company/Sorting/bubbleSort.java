package com.company.Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[]args){
        int[] arr = new int[]{1,2,5,4,3,6};
        bubbleSrt(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void bubbleSrt(int[] arr){
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length-i-1; j++)
                if (arr[j] > arr[j+1])                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
