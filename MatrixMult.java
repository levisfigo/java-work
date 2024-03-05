/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixmult;

public class MatrixMult {
    
    public static int[][] multiply(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 7, 6}
        };

        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {10, 12}
        };

        int[][] result = multiply(matrixA, matrixB);

        // Displaying the result matrix
        System.out.println("Result of matrix multiplication:");
        for (int[] result1 : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result1[j] + " ");
            }
            System.out.println();
        }
    }
}

