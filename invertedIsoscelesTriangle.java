package com.company;
import java.util.Scanner;

public class invertedIsoscelesTriangle{
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
            
            for (int space=1; space<=(row-1); ++space){
                System.out.print(" ");
            }
            /* column will print 2(n-row+1)-1 times*/
            for (int col = 1; col<=2*(n-row+1)-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
