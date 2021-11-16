package com.company;
import java.util.*;

public class Solution{
    static int[][] g =new int[10][10];
    static int j, i=0, v=0;
    static int [] visit=new int[i];

    public static void DFS(int p){
        int o;
        for (int i=0; i<v; i++)
        if(!(visit[i]) && g[i][j]==1){
            DFS(i);
        }
    }
    public static void main(String[]args){

        System.out.println("Enter vertices:");
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();

        System.out.println("Enter adjacent matrix:");
        for(i=0;i<v; i++){
            for (j=0; j<v; j++){
               int k = sc.nextInt();
               System.out.println(g[i][j]);
            }
        }
        for(int f=0; f<v; f++){
            visit[i]=0;
            DFS(0);
        }
    }
}