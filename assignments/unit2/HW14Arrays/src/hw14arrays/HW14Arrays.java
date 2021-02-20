package hw14arrays;

import java.util.Scanner;

/**
 *
 * @author MonseCordova
 */
public class HW14Arrays {

    public static void main(String[] args) {
        int[] candiesStock;
        String[] candies = {"Bianchi", "Zoom", "Grissly", "Plop", "Ice cream"};
        int n;

        System.out.println("Enter the number of containers that you have");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        candiesStock = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of candis into container " + (i + 1) + " -> ");
            candiesStock[i] = input.nextInt();
        }
        for (int candy : candiesStock) {
            System.out.println("The candies on a container is " + candy);
        }
        for (String candy : candies) {
            System.out.println("Candies' brands -> " + candy);
        }

    }

}
