package ec.edu.espe.SearchAlgorith;

/**
 *
 * @author MonseCordova
 */
public class SearchingAlghorithms {

    public static double binarySearch(double phoneNumbers[], int left, int right, int phoneToSearch) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (phoneNumbers[mid] == phoneToSearch) 
                return mid;
            
               if (phoneNumbers[mid] > phoneToSearch) 
                    return binarySearch(phoneNumbers, left, mid - 1, phoneToSearch);

                return binarySearch(phoneNumbers, mid + 1, right, phoneToSearch);
            }
        
        return -1;
    }

    public static double linearSearch(double phoneNumbers[], double phoneToSearch) {
        int n = phoneNumbers.length;
        for (int i = 0; i < n; i++) {
            if (phoneNumbers[i] == phoneToSearch) {
                return i;
            }
        }
        return -1;
    }
}
