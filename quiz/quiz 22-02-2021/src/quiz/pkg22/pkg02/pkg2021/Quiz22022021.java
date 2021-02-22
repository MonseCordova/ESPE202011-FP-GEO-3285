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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        int clients = 0 ; 
        int age;
        int number;
        
        String name;
        name = input.nextline;
        System.out.println("Enter the Number of clients ");
         numbers = entrada.nextLine();
        for (int i= 1;i<=clients;i++)
        {
            System.out.println("Enter the Number of clients");
             name = input.nextline;
            name = entrada.nextLine();
            
            System.out.println("Enter the ages of clients ");
           age = entrada.nextInt();
           System.out.println("the clients : "+name+" have "+age+" ages");
        }
    }
}
    
