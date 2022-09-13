package DSA.CLRS.DivideAndConquer.MatrixMultiplication;

// A bruteForce method for matrix multiplication.
// We know that formula for matrix multiplication is: (k=1) ∑ (n) a(ik).b(kj)
// Complexity is O(n^3)

import java.util.Arrays;

public class SqMatrixMultiplicationBF {
    public static int[][] MatrixMultiplication(int[][] A, int[][] B){
        int rows = A.length;
        int[][] c = new int[rows][rows];
        for(int i = 0; i<=rows-1; i++){             //for iterating rows.
            for(int j = 0; j<=rows-1; j++){         //for iterating columns.
                c[i][j]=0;
                for(int k = 0; k<=rows-1; k++){     //for iterating k
                    c[i][j] = c[i][j] + A[i][k]*B[k][j];
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[][] matrixA = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrixB = new int[][]{
                {8, 4, 5},
                {1, 6, 2},
                {9, 2, 1}
        };
        int [][] c = (MatrixMultiplication(matrixA, matrixB));
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
