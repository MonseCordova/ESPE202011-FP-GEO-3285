package hw15matrixoperation;
import java.util.Scanner;

/**
 *
 * @author MonseCordova
 */
public class HW15MatrixOperation {
    public static void main(String[] args) {

        int[][] matrixA;
        int[][] matrixB;
        int[][] matrixC;
        int columnsNumbers = 0;
        int rowsNumbers = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(" =================\n MATRIX ADDITION \n ================= ");
        System.out.println("Welcome User \n Please, enter the nomber of the rows that the Matrix A has. ");
        rowsNumbers = input.nextInt();
        System.out.println("Please, enter the nomber of the columns that the Matrix A has.");
        columnsNumbers = input.nextInt();

        matrixA = new int[columnsNumbers][rowsNumbers];

        System.out.println("Enter the Matrix Elements");
        for (int i = 0; i < columnsNumbers; i++) {
            for (int j = 0; j < rowsNumbers; j++) {
                System.out.println("a_[" + (i + 1) + "][" + (j + 1) + "] --> ");
                matrixA[i][j] = input.nextInt();
            }
        }
        printMatrixA(columnsNumbers, rowsNumbers, matrixA);

        System.out.println("Matrix B");
        System.out.println("Please, enter the nomber of the rows that the Matrix B has. ");
        rowsNumbers = input.nextInt();
        System.out.println("Please, enter the nomber of the columns that the Matrix B has.");
        columnsNumbers = input.nextInt();

        matrixB = new int[columnsNumbers][rowsNumbers];

        System.out.println("Enter the Matrix Elements");
        for (int i = 0; i < columnsNumbers; i++) {
            for (int j = 0; j < rowsNumbers; j++) {
                System.out.println("b_[" + (i + 1) + "][" + (j + 1) + "] --> ");
                matrixB[i][j] = input.nextInt();
            }
        }

        printMatrixB(columnsNumbers, rowsNumbers, matrixB);

        matrixC = new int[columnsNumbers][rowsNumbers];
        for (int i = 0; i < columnsNumbers; i++) {
            for (int j = 0; j < rowsNumbers; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        printMatrixC(columnsNumbers, rowsNumbers, matrixC);
    }

    public static void printMatrixC(int columnsNumbers, int rowsNumbers, int[][] matrixC) {
        System.out.println("\n The Matrix C is equal to --> ");
        for (int i = 0; i < columnsNumbers; i++) {
            System.out.println("");
            for (int j = 0; j < rowsNumbers; j++) {
                System.out.print("\t " + matrixC[i][j]);
            }
        }
    }

    public static void printMatrixB(int columnsNumbers, int rowsNumbers, int[][] matrixB) {
        System.out.println("Matrix B");
        for (int i = 0; i < columnsNumbers; i++) {
            System.out.println("");
            for (int j = 0; j < rowsNumbers; j++) {
                System.out.print("\t " + matrixB[i][j]);
            }
        }
    }

    public static void printMatrixA(int columnsNumbers, int rowsNumbers, int[][] matrixA) {
        System.out.println("Matrix A");
        for (int i = 0; i < columnsNumbers; i++) {
            System.out.println("");
            for (int j = 0; j < rowsNumbers; j++) {
                System.out.print("\t " + matrixA[i][j]);
            }
        }
    }
}
