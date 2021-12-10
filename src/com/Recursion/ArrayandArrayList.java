package com.Recursion;

import java.util.*;

public class ArrayandArrayList {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(5 //initial size /*Makes program use less resource*/);
//        Scanner sc = new Scanner(System.in);
//
//        int i=5;
//        while(i!=0) {
//            list.add(sc.nextInt());
//            i--;
//        }
//        list.set(4, 8854);
//        Collections.swap(list, 3, 4);
//        System.out.print(list);
        int [] faaltu = new int[]{5, 6, 3, 2};
        System.out.println(Arrays.toString(faaltu));
        reverse(faaltu, 0,3);
        System.out.println(Arrays.toString(faaltu));
    }
    static void reverse(int[] arr, int start, int end){
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] list, int I1, int I2){
        int temp = list[I1];
        list[I1]=list[I2];
        list[I2]=temp;
    }
}
