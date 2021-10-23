package com.company;
import java.util.Scanner;
public class invertedTriangle{
    public static void main(String [] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int store=sc.nextInt();
        pattern(store);
    }
    static void pattern(int n){
        // outer loo will run for row
        for(int row=1; row<=n; row++){
            /* 1. now for first row we need to define columns
            *  2. columns will be same as n
            *  3. till position n-row print space
            *  4. at position n print *
            */
            int dividePoint=(n-row);
            int space;
            for( space=1; space <= dividePoint; ++space) {
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
