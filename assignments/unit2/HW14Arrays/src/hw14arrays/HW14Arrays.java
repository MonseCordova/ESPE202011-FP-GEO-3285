package hw14arrays;

import java.util.Scanner;

/**
 *
 * @author MonseCordova
 */
public class HW14Arrays {

    public static void main(String[] args) {
        int[] candiesStock;
        String[] candies = {"Bianchi", "Zoom", "Grissly", "Plop", "Masmellos"};
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

        int[] snacksEaten;
        String[] snacks = {"Doritos", "Ruffles", "Kachitos", "Tostitos", "Onion Ringes", "Pa`Fritas", "Tortolines"};
        int m;

        System.out.println("Enter the number of containers that you have");
        m = input.nextInt();
        snacksEaten = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter the number of snacks eaten in day " + (i + 1) + " -> ");
            snacksEaten[i] = input.nextInt();
        }
        for (int snack : snacksEaten) {
            System.out.println("The number of snacks eaten is " + snack);
        }
        for (String snack : snacks) {
            System.out.println("Candies' brands -> " + snack);
        }

        int[] iceCreamsSold;
        String[] iceCreamFlavors = {"Chocolate", "Vanilla", "Strawberry", "Mint", "Coconut", "Coffe", "Soursoup"};
        int x;

        System.out.println("Enter the value of Ice crems sold per day");
        x = input.nextInt();
        iceCreamsSold = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the value of Ice creams sold in day " + (i + 1) + " -> ");
            iceCreamsSold[i] = input.nextInt();
        }
        for (int iceCreams : iceCreamsSold) {
            System.out.println("The number of ice cream sold is " + iceCreams);
        }
        for (String iceCream : iceCreamFlavors) {
            System.out.println("Ice creams´ flavores -> " + iceCream);
        }
    }

}
