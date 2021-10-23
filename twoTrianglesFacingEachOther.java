package com.company;
import java.util.Scanner;
public class good{
    public static void main(String[] args){
        System.out.println("Enter:");
        Scanner sc = new Scanner(System.in);
        int scan=sc.nextInt();
        pattern(scan);
    }
    static void pattern(int n){
        //first make upper pattern

        for(int row=1; row<=n; row++){
            //spaces
            int starLogic = (n-(row-1));
            int spaceLogic = (row-1);
            for(int spaces=1; spaces<=spaceLogic; spaces++){
                System.out.print(" ");
            }
            //stars
            for(int col=1; col<=starLogic; col++){
                System.out.print("* ");
            }
                System.out.println();
        }
        for(int row = 1; row<=n; row++) {
            //below triangle pattern
            // 4 gap ke bad *
            int gapLogic = n-row;
            for(int space=1; space<=gapLogic; space++){
                System.out.print(" ");
            }
            for(int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
