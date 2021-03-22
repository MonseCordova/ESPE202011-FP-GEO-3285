package hw18searching;

import ec.edu.espe.SearchAlgorith.SearchingAlghorithms;
import java.util.Scanner;

/**
 *
 * @author MonseCordova
 */
public class HW18Searching {

    public static void main(String[] args) {

        double phonesNumbers[] = {995649331, 987047146, 995414774, 998934825, 959463768, 984365304, 98404820, 996621177, 962678887};
        int phoneToSearch;
        double result;
        double result2;
        int left = 0;
        int right = 0;
       
        Scanner input = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Give me a phone number to search");
        phoneToSearch = input.nextInt();

        System.out.println("I find those results using Linear Search");
        result = SearchingAlghorithms.linearSearch(phonesNumbers, phoneToSearch);
        System.out.println("I found " + phoneToSearch + " at index " + result);
        
        System.out.println("I found these results using Binary Search");
        result2 = SearchingAlghorithms.binarySearch(phonesNumbers, left, right, phoneToSearch);
        System.out.println("I found " + phoneToSearch + " at " + result2);

    }
}
