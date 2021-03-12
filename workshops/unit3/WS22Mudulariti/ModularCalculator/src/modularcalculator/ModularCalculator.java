package modularcalculator;

import java.util.Scanner;
import util.BasesOperations;

/**
 *
 * @author LENOVO
 */
public class ModularCalculator {

    private static float number1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float elment1;
        float element2;
        float result;

        Scanner input = new Scanner(System.in);
        System.out.println("Hello User  \n Enter element 1 please");
        elment1 = input.nextFloat();
        System.out.println("Enter element 2 please");
        element2 = input.nextFloat();

        result = BasesOperations.addTwoNumbers(elment1, element2);
        System.out.println("The addition between " + elment1 + " + " + element2 + " is equal to --> " + result);
        result = BasesOperations.subtractTwoNumbers(elment1, element2);
        System.out.println("The subtraction between " + elment1 + " - " + element2 + " is equal to --> " + result);
        result = BasesOperations.multiplyTwoNumbers(elment1, element2);
        System.out.println("The multiply between " + elment1 + " * " + element2 + " is equal to --> " + result);
        result = BasesOperations.divideTwoNumbers(elment1, element2);
        System.out.println("The division between " + elment1 + " / " + element2 + " is equal to --> " + result);
    }
}


