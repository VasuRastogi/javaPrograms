package DSA.DynamicProgramming.MCM;

// this method gives O(n^3) T.C so, not preffered.
public class MatrixChainMutiplication_bruteforce {
    static int[][] C = new int[3][3];
    public static void mcm(int[][]A1, int[][]A2){
        if(A2[0].length != A2.length){
            System.err.println("Error: The number of columns in matrix A must be equal to the number of rows in matrix B");
        }


        // A[0].length shows length of column and A.length shows length of row.
        // values of for loop are like this because A(m*n) X B(n*k) == C(m*k)
        for (int i = 0; i<A1.length; i++){
           for (int j =0 ; j<A2[0].length; j++){
               for (int k =0; k<A2.length; k++){
                   C[i][j] = C[i][j]+A1[i][k]*A2[k][j];
               }
           }
        }
    }
    public static void print(){
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]a1 ={{1, 2, 3}, {3, 4, 4}, {3, 5, 5}};
        int[][]a2 ={{3, 2, 4}, {7, 7, 3}, {6, 2, 9}};
        mcm(a1, a2);
        print();
    }
}
