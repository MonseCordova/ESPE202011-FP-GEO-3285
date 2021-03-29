package ec.edu.espe.iceCreamFlavores.controller;

/**
 *
 * @author MonseCordova
 */
public class Searcher {

    public static int findFlavour(String[] elements, String x) {
        int i;
        int n = elements.length;
        for (i = 0; i < n; i++) {
            if (elements[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
