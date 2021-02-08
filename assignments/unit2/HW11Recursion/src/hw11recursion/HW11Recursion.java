package hw11recursion;

import java.util.Scanner;

/**
 *
 * @author MonseCordova
 */
public class HW11Recursion {

    public static void main(String[] args) {
        countBack();
    
    }

    public static void countBack() {
        int n = 1;
        int end;
        System.out.println("Enter a number to start ");
        Scanner input = new Scanner(System.in);
        end = input.nextInt();
           
        for (n = end; n >= 1; n--) {
            System.out.println("Te count back from " + n + " to one " + " is equal to --> ");
            System.out.println(n);
        }
    }
    
}

