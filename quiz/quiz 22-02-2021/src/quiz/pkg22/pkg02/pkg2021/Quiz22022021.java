/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz.pkg22.pkg02.pkg2021;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author LENOVO
 */
public class Quiz22022021 {
    private static String numbers;
    private static String name;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int costumer = 0 ; 
        int age;
        int number;   
        String nombres; 
        System.out.print("Enter the number of costumer ");
        costumer = input.nextInt(); 
        for (int i=0;i<costumer;i++)
        {
           input.nextLine();
            System.out.print("Enter the name of the costumer");
            nombres = input.nextLine();
            System.out.print("Enter the costumer age ");
           age = input.nextInt();
           System.out.println(" ages"+"the costumer : "+name+" have "+age);
        }
    }
}
    
