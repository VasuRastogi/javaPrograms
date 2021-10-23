package com.company;
import java.util.Scanner;

public class Triangle{
    public static void main(String [] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int store=sc.nextInt();
        pattern(store);
    }
    static void pattern(int n){
        // outer loo will run for row
        for(int row=1; row<=n; row++){
            /*lets care about spaces*/
            // n spaces pehele
            for (int space=1; space<=(n-row); ++space){
                System.out.print(" ");
            }
            /* column will print 2*row-1 items*/
            for (int col = 1; col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
