package com.company;
import java.util.Scanner;
public class good {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }

    static void pattern(int n) {
        for (int row = 1; row < n; row++) {
            // n then (n-row) & (n+row)
            for(int col=1; col<=n+row-1; col++){
                if(col==n-row+1 || col==n+row-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
        for(int k=1; k<=2*n-1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
