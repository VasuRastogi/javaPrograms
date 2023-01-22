package DSA.DynamicProgramming;

public class MatrixChainMutiplication {
    static int[][] C = new int[3][3];
    public static void mcm(int[][]A1, int[][]A2){
        if(A2[0].length != A2.length){
            System.err.println("Error: The number of columns in matrix A must be equal to the number of rows in matrix B");
        }


        for (int i = 0; i<3; i++){
           for (int j =0 ; j<3; j++){
               for (int k =0; k<3; k++){
                   C[i][j] = C[i][j]+A1[i][k]*A2[k][j];
               }
           }
        }
    }
    public static void print(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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
