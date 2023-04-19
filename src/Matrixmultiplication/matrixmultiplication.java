package Matrixmultiplication;

public class matrixmultiplication {
    public static void main(String[] args) {
        // Define the matrices to multiply
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
        
        // Determine the dimensions of the matrices
        int m1Rows = matrix1.length;
        int m1Cols = matrix1[0].length;
        int m2Rows = matrix2.length;
        int m2Cols = matrix2[0].length;
        
        // Check if the matrices can be multiplied
        if (m1Cols != m2Rows) {
            System.out.println("Error: Cannot multiply these matrices");
            return;
        }
        
        // Perform the matrix multiplication
        int[][] result = new int[m1Rows][m2Cols];
        for (int i = 0; i < m1Rows; i++) {
            for (int j = 0; j < m2Cols; j++) {
                for (int k = 0; k < m1Cols; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        // Print the result
        System.out.println("Result:");
        for (int i = 0; i < m1Rows; i++) {
            for (int j = 0; j < m2Cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }


}
