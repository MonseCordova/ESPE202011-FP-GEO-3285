

package controlstatement;

import java.util.Scanner;


 
public class ControlStatement {

     
    public static void main(String[] args) {
   System.out.println("Enter an Integer number:");

    Scanner input= new Scanner(System.in);
    int num = input.nextInt();

    if ( num % 2 == 0 )
        System.out.println("The number entered is even");
     else
        System.out.println("The number entered is odd");
  }
}    
    
    

