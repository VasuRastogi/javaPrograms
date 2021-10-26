package com.company;
public class Solution {
    public static int mySqrt(int x) {
        // we need to find square root of x
        // a*a=x then 'a' is square root
        for(int i =x; i>=0; i--) {
            if (i * i == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int ans=mySqrt(8);
        System.out.println(ans);
    }
}