package ws11functionsandrecurences;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class WS11FunctionsAndRecurences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int diviend;
        int divisor;
        float quotient;
        int stop = 12;
        int multiplier;
        int table;
        int Square1;
        int square2;
        int value;
        int number;
        int i = 1;

        System.out.println("|============================|" + "\n"
                + " *      Welcome user          *\n"
                + "|       Monse Cordova        |" + "\n"
                + "|============================|");

        System.out.println("|============================|" + "\n"
                + "|          Division          |" + "\n"
                + "|============================|");

        System.out.println("|============================|" + "\n"
                + "|  Please enter the first number |" + "\n"
                + "|============================|");

        diviend = input.nextInt();
        System.out.println("|============================|" + "\n"
                + "|  Please, enter the second number |" + "\n"
                + "|============================|");
        divisor = input.nextInt();

        quotient = divideTwoNumbers(diviend, divisor);

        System.out.println("|============================|"
                + "\n" + diviend + " / " + divisor + " is " + quotient + "\n"
                + "|============================|" + "\n");

        System.out.println("|============================|" + "\n"
                + "|         Power         |" + "\n"
                + "|============================|");

        System.out.println("|============================|" + "\n"
                + "|     enter a  number     |" + "\n"
                + "|============================|");

        square2 = input.nextInt();
        Square1 = FindASquareTheNumber(square2);

        System.out.println("|============================|"
                + "\n The square of " + square2 + " is equal to -> " + Square1 + "\n"
                + "|============================|" + "\n");
        System.out.println("|============================|" + "\n"
                + "|          Function         |" + "\n"
                + "|         g(x) = x^2+2x+1       |" + "\n"
                + "|============================|");
        System.out.println("|============================|" + "\n"
                + "|          Enter a value for x       |" + "\n"
                + "|============================|");
        
        number = input.nextInt();
        value = ComputeAparabola(number);
        
        System.out.println("|============================|"
                + "\n" + " function = " + value + "\n"
                + "|============================|" + "\n");
        
        System.out.println("================================================ " + "\n"
                + "| Enter a value to multiply   |" + "\n"
                + "================================================ ");
        
        multiplier = input.nextInt();
        
        System.out.println("================================================ " + "\n"
                + "       Multiplication Tables " + multiplier + "       " + "\n"
                + "================================================ ");
        table = MultiplyNumbers(multiplier);

    }

    public static float divideTwoNumbers(int divnd, int divisr) {
        float quotient;
        quotient = (float) divnd / divisr;
        return quotient;
    }

    public static int FindASquareTheNumber(int number) {
        int Square1;
        Square1 = number * number;
        return Square1;
    }

    public static int ComputeAparabola(int number) {
        int value;
        value = number * number + 2 * number + 1;
        return value;
    }

    public static intshowTheMultiplicationTables (int m) {

        int n = (int) 0.0F;
        int stop = 12;

        for (int s = 1; s <= stop; s++) {
            n = m * s;
            System.out.println(m + " * " + s + " = " + n);
        }
        System.out.println("================================================ ");
        return n;
    }
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
public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));
            }
        }
}

