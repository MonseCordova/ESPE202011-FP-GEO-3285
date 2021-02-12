package hw11recursion;

/**
 *
 * @author MonseCordova
 */
public class HW11Recursion {

    public static void main(String[] args) {

        int rowsNumber = 10;
        int[] a = new int[1];
        
        for (int n = 1; n <= rowsNumber; n++) {
            int[] x = new int[n];
            for (int m = 0; m < n; m++) {
                if (m == 0 || m == (n - 1)) {
                    x[m] = 1;
                } else {
                    x[m] = a[m] + a[m - 1];
                }
                System.out.print(x[m] + " ");
            }
            a = x;
            System.out.println();
        }
    }
}
