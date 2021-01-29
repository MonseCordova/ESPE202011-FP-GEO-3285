package ws08debugging;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class WS08debugging {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int multiplicand;
        int multiplier;
        int product;
        int stop;
        stop = 12;
        do {
            System.out.println("Enter The Table You Want To Study");
            System.out.println("0. (zero) to exit --> ");
            Scanner input = new Scanner(System.in);
            multiplicand = input.nextInt();
            if (multiplicand != 0) {
                System.out.println("Studying The Table At -->");
                for (multiplier = 1; multiplier <= stop; multiplier++) {
                    product = multiplicand * multiplier;
                    System.out.println(multiplicand + " * " + multiplier + " = " 
                            + product);
                }
            }
        }while(multiplicand!= 0);

        System.out.println("God Bye");
    }
    
}
