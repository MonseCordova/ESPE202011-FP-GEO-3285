package utlls;

import java.util.Scanner;

/**
 *
 * @author MonseCordova
 */
public class ReadAndPrintTheMatrix {

    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("--Row Numbers" + (i + 1) + "--");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "][" + (j + 1) + "] ->");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

    public static void prettyPrintMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.println("\t");
                    } else if (i == m - 1) {
                        System.out.println("\t");

                    } else {
                        System.out.println("\t");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.println("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.println("\t");
                    } else if (i == m - 1) {
                        System.out.println("\t");

                    } else {
                        System.out.println("\t");
                    }
                }
            }
        }
        System.out.println("");
    }
}
