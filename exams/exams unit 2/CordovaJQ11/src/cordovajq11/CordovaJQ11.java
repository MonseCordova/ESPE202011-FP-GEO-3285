
package cordovajq11;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class CordovaJQ11 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int sum;
     int value;
     int number [];
     float average[];
     number = new int [5];
     average = new float[3];
      
     System.out.println("Please enter 5 values for addition");
     for(int i = 1; i <= 3 ;i++){
          System.out.println("Please enter  values" + i +"-->");
          number[i] = input.nextInt();
    }
      for(int i = 1; i <= 3 ;i++){
    System.out.println("Please enter  values" + i +"-->");
    average[i]= input.nextInt();
      }
      System.out.println("values is ");
      for (int i = 0; i < 5; i++){
          System.out.println(number[1]);
        System.out.println("1. Menter amounts ");  
        
        int sum;
        sum =0;
        int[] array = new int[5];
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < 5; i++){

            System.out.print("Enter the " + i + " number:");
            array[i] = ent.nextInt();
            sum += array[i];

        }
        System.out.print("The total sum is: " + sum);
          
      }
  System.out.println("2. Matrix Averague ");  
         int suma = 0;
        int pro=0;
        int[] num = new int[5];
        for(int i = 0; i < 5; i++) {
             
            System.out.println("enter amounts");
            num[i] = input.nextInt();
            suma += num[i];
         }
        for(int i = 0; i < 5; i++) {
             
            System.out.println("In the position "+(i+1)+" it was saved: "+num[i]);
        }
        pro=suma/5;
        System.out.println("The average is: "+pro);
}
}