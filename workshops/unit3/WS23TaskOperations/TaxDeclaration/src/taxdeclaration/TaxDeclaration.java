package taxdeclaration;

import ec.edu.espe.BasicTax;
import java.util.Scanner;

/**
 *
 * Juana Monserrat
 */
public class TaxDeclaration {

    public static void main(String[] args) {
        float price;
        float totalPrice;
        float IVAValue;
        final float ivaPercentage = 12;

        Scanner input = new Scanner(System.in);
        System.out.println("Monse Cordova");
        System.out.println(" IVA-> ");
        System.out.println("Enter you value productos ");
        price = input.nextFloat();

        IVAValue = BasicTax.computeVAT(price, ivaPercentage);
        totalPrice = price + IVAValue;

        System.out.println("Total price --> " + totalPrice);
    }

}
