package hw16matrixfuntion;

import java.util.Scanner;

/**
 *
 * @author MonseCordova
 */
public class HW16MatrixFuntion {

    public static void main(String[] args) {

        float[][] matrixA;
        float[][] matrixB;
        float[][] matrixC;
        int columnsNumbers = 0;
        int rowsNumbers = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(" =================\n MATRIX ADDITION \n ================= ");
        System.out.println("Welcome User \n Please, enter the number of the rows that the Matrix A has. ");
        rowsNumbers = input.nextInt();
        System.out.println("Please, enter the number of the columns that the Matrix A has.");
        columnsNumbers = input.nextInt();

        matrixA = new float[columnsNumbers][rowsNumbers];
        matrixB = new float[columnsNumbers][rowsNumbers];
        matrixC = new float[columnsNumbers][rowsNumbers];

        System.out.println("Enter the elements of the matrix");

        matrixA = readMatrixElements(columnsNumbers, rowsNumbers, "A", input);
        matrixB = readMatrixElements(columnsNumbers, rowsNumbers, "B", input);

        for (int tab = 0; tab <= rowsNumbers / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println(" A");

        prettyPrintMatrix(columnsNumbers, rowsNumbers, matrixA);
        System.out.println("");

        System.out.println(" B ");
        prettyPrintMatrix(columnsNumbers, rowsNumbers, matrixB);

        System.out.println("The sum of matrices is");

        matrixC = addTwoMatrices(columnsNumbers, rowsNumbers, matrixA, matrixB);
        prettyPrintMatrix(columnsNumbers, rowsNumbers, matrixC);
    }

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

    public static float[][] addTwoMatrices(int m, int n, float[][] A, float[][] B) {
        float[][] C;
        C = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
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

    public static void printMatrix(int m, int n, float[][] matrix) {
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
