package DSA.CLRS.DivideAndConquer.MatrixMultiplication;

// divide the matrix into 1 X 1 matrix and use equation:
// c11 = a11.b11 + a12.b21,
// c12 = a11.b12 + a12.b22,
// c21 = a21.b11 + a22.b21,
// c22 = a21.b12 + a22.b22,

public class SqMatrixMultiplyRecursive {
    public static int[][] SquareMatrixMultiplyRecursive(int[][] a, int[][] b, int row){
        int [][] c = new int[row][row];

        if(row == 1){c[0][0]=a[0][0]*b[0][0];}
        else if(row == 2){
            c[0][0] = a[0][0]*b[0][0] + a[0][1]*b[1][0];
            c[0][1] = a[0][0]*b[0][1] + a[0][1]*b[1][1];
            c[1][0] = a[1][0]*b[0][0] + a[1][1]*b[1][0];
            c[1][1] = a[1][0]*b[0][1] + a[1][1]*b[1][1];
        }
        else{
            int mid = row/2;
            int[][]A = new int[row][row];
//
//            c[0][0] = SquareMatrixMultiplyRecursive(a[0][0], b[0][0], mid) + SquareMatrixMultiplyRecursive(a[0][0], b[0][0], mid);
//            c[0][1] = SquareMatrixMultiplyRecursive(a[0][0], b[0][1], mid) + SquareMatrixMultiplyRecursive(a[0][1], b[1][1], mid);
//            c[1][0] = SquareMatrixMultiplyRecursive(a[1][0], b[0][0], mid) + SquareMatrixMultiplyRecursive(a[1][1], b[1][0], mid);
//            c[1][1] = SquareMatrixMultiplyRecursive(a[1][0], b[0][1], mid) + SquareMatrixMultiplyRecursive(a[1][1], b[1][1], mid);
        }
        return c;
    }
}
