package hw09.embeddedstructures;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class HW09EmbeddedStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int opperator_1;
        int opperator_2;
        int sum;
        int product;
        int module;
        float division;
        int i = 0;
        int j = 0;
        int stop = 12;

        do {
            System.out.println("Please enter a number");
            Scanner input = new Scanner(System.in);
            opperator_1 = input.nextInt();

            System.out.println("Please enter a number");
            Scanner input2 = new Scanner(System.in);
            opperator_2 = input.nextInt();

            System.out.println("Enter 0 (zero) to exit ");

            if (opperator_1 % 2 == 0 && opperator_2 % 2 == 0) {
                MultipliTwoNumbers(opperator_1, opperator_2);
            } else {
                if (opperator_1 % 3 == 0 && opperator_2 % 3 == 0) {
                    AddingTwoNumbers(opperator_1, opperator_2);

                } else {
                    if (opperator_1 % 7 == 0 && opperator_2 % 7 == 0) {
                        DivideTwoNumbersModule(opperator_1, opperator_2);

                    } else {
                        if (opperator_1 % 11 == 0 && opperator_2 % 11 == 0) {
                            ShowMultiplicanTable(i, stop, opperator_1);

                            System.out.println("========================");

                            ShowMultiplicanTable(j, stop, opperator_2);

                        } else {
                            if (opperator_1 % 13 == 0 && opperator_2 % 13 == 0) {
                                DivideTwoNumbers(opperator_1, opperator_2);

                            } else {
                                System.out.println("Invalid option, try again please");
                            }

                        }
                    }
                }

            }
        } while (opperator_1 != 0 && opperator_2 != 0);
        System.out.println("See you later");
    }

    public static void DivideTwoNumbers(int opperator_1, int opperator_2) {
        float division;
        division = opperator_1 / opperator_2;
        System.out.println("The division of " + opperator_1 + " / "
                + opperator_2 + " is equal to --> " + division);
    }

    public static void ShowMultiplicanTable(int i, int stop, int opperator_1) {
        int product;
        for (i = 1; i <= stop; i++) {
            product = i * opperator_1;
            System.out.println(i + " * " + opperator_1 + " = "
                    + product);
        }
    }

    public static void DivideTwoNumbersModule(int opperator_1, int opperator_2) {
        int module;
        module = opperator_1 % opperator_2;
        System.out.println("The division of " + opperator_1 + " % "
                + opperator_2 + " is equal to --> " + module);
    }

    public static void AddingTwoNumbers(int opperator_1, int opperator_2) {
        int sum;
        sum = opperator_1 + opperator_2;
        System.out.println("The addition of " + opperator_1 + " + "
                + opperator_2 + " is equal to --> " + sum);
    }

    public static void MultipliTwoNumbers(int opperator_1, int opperator_2) {
        int product;
        product = opperator_1 * opperator_2;
        System.out.println("The multiplication of " + opperator_1 + " * "
                + opperator_2 + " is equal to --> " + product);
    }
}

  