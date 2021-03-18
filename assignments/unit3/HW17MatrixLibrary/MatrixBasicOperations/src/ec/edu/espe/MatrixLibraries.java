package ec.edu.espe;

/**
 *
 * @author MonseCordova
 */
public class MatrixLibraries {

    public static float[][] addTwoMatrices(int m, int n, float[][] matrixA, float[][] matrixB) {
        float[][] matrixC;
        matrixC = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixC;
    }

    public static float[][] subtractTwoMatrices(int m, int n, float[][] matrixA, float[][] matrixB) {
        float[][] matrixD;
        matrixD = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixD[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return matrixD;
    }

    public static float[][] multiplyTwoMatrices(int m, int n, float[][] matrixA, float[][] matrixB) {
        int sum = 0;
        float[][] matrixE;
        matrixE = new float[m][n];

        for (int a = 0; a <matrixB[0].length; a++) {
            for (int i = 0; i < matrixA.length; i++) {
                
                for (int j = 0; j < matrixA[0].length; j++) {

                    sum += matrixA[i][j] * matrixB[j][a];
                }

               matrixE[i][a] = sum;
            }
        }
        return matrixE;
    }
}
