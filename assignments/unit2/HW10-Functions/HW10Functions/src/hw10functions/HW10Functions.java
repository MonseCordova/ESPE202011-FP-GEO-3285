package hw10functions;

import java.util.Scanner;

/**
 *
 * @author Monse Cordova
 */
public class HW10Functions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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
                + "\n" + square2 + " ^ 2 es " + Square1 + "\n"
                + "|============================|" + "\n");
        System.out.println("|============================|" + "\n"
                + "|          Function         |" + "\n"
                + "|         g(x) = x^2+2x+1       |" + "\n"
                + "|============================|");
        System.out.println("|============================|" + "\n"
                + "|          Enter a value for x       |" + "\n"
                + "|============================|");
        
        number = input.nextInt();
        value = Polynomial(number);
        
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

    public static int Polynomial(int number) {
        int value;
        value = number * number + 2 * number + 1;
        return value;
    }

    public static int MultiplyNumbers(int m) {

        int n = (int) 0.0F;
        int stop = 12;

        for (int s = 1; s <= stop; s++) {
            n = m * s;
            System.out.println(m + " * " + s + " = " + n);
        }
        System.out.println("================================================ ");
        return n;
    }

}
