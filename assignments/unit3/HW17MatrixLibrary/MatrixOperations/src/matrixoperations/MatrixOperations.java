package matrixoperations;

import java.util.Scanner;
import utlls.ReadAndPrintTheMatrix;
import ec.edu.espe.MatrixLibraries;

/**
 *
 * @author MonseCordova
 */
public class MatrixOperations {

    public static void main(String[] args) {

        float[][] matrixA;
        float[][] matrixB;
        float[][] matrixC;
        float[][] matrixD;
        float[][] matrixE;
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
        matrixD = new float[columnsNumbers][rowsNumbers];
        matrixE = new float[columnsNumbers][rowsNumbers];
        System.out.println("Enter the elements of the matrix");

        matrixA = ReadAndPrintTheMatrix.readMatrixElements(rowsNumbers, rowsNumbers, null, input);
        matrixB = ReadAndPrintTheMatrix.readMatrixElements(rowsNumbers, rowsNumbers, null, input);

        for (int tab = 0; tab <= rowsNumbers / 2; tab++) {
            System.out.print("\t");
        }
        System.out.println(" A");

        ReadAndPrintTheMatrix.prettyPrintMatrix(rowsNumbers, rowsNumbers, matrixA);
        System.out.print("");

        System.out.println(" B ");
        ReadAndPrintTheMatrix.prettyPrintMatrix(rowsNumbers, rowsNumbers, matrixB);

        System.out.println("The sum of matrices is \n");
        matrixC = MatrixLibraries.addTwoMatrices(rowsNumbers, rowsNumbers, matrixA, matrixB);
        ReadAndPrintTheMatrix.prettyPrintMatrix(rowsNumbers, rowsNumbers, matrixC);
        System.out.println("The substraccion of matrices is \n");
        matrixD = MatrixLibraries.addsubtractTwoMatrices(rowsNumbers, rowsNumbers, matrixA, matrixB);
        ReadAndPrintTheMatrix.prettyPrintMatrix(rowsNumbers, rowsNumbers, matrixD);
        System.out.println("The multiply of matrices is \n");
        matrixE = MatrixLibraries.multiplyTwoMatrices(rowsNumbers, rowsNumbers, matrixA, matrixB);
        ReadAndPrintTheMatrix.prettyPrintMatrix(rowsNumbers, rowsNumbers, matrixE);
    }
}
