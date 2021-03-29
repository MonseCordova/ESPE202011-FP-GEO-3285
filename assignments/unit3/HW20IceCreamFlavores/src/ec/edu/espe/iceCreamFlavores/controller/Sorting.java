package ec.edu.espe.iceCreamFlavores.controller;

/**
 *
 * @author MonseVite
 */
public class Sorting {

    public static String[] sortFlavours(String[] iceCremFlavours) {
        int n = iceCremFlavours.length;
        for (int i = 0; i < iceCremFlavours.length; i++) {
            for (int j = i + 1; j < iceCremFlavours.length; j++) {
                if (iceCremFlavours[i].compareTo(iceCremFlavours[j]) > 0) {
                    String temp = iceCremFlavours[i];
                    iceCremFlavours[i] = iceCremFlavours[j];
                    iceCremFlavours[j] = temp;
                }
            }
        }
        System.out.print("Strings in Sorted Order:");
        for (int i = 0; i <= iceCremFlavours.length - 1; i++) {
            System.out.print(iceCremFlavours[i] + ", ");
        }
        return iceCremFlavours;
    }
}
