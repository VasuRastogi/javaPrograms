package com.company;
import java.util.Scanner;
class Solution{
    public static void main(String[]args){
        //get size of array;

        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();

        int[] ar = new int[size];
        //get input

        for(int i=0; i<size; i++){
            Scanner sc1 = new Scanner(System.in);
            int store = sc1.nextInt();
            ar[i]=store;
        }
        int j=0;
        //add
        for(j=1; j<size; j++){
            ar[j]=ar[j-1]+ar[j];
        }

        // print

        System.out.println(ar[size-1]);
    }

}