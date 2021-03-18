
package sorting;

/**
 *
 * @MonseCordova
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] integersToSort = {9, 7, 1, 6, 2, 3};
        
        System.out.println("Unsorted integers");
        printArray(integersToSort);
        BubbleSort.sortByBubbleSort(integersToSort);
        System.out.println("");
        printArray(integersToSort);
        
        int[] integersToSort2 = {8, 1, 7, 2, 5};
        
        System.out.println("Unsorted integers");
        printArray(integersToSort2);
        BubbleSort.sortByBubbleSort(integersToSort2);
        System.out.println("");
        printArray(integersToSort2);
        
    }

    
    public static void printArray(int[] integers){
        int n = integers.length;
        for (int i = 0 ; i <n;i++){
            System.out.print(integers[i] + " , ");
        }
        System.out.println("");
    }
    }
    

