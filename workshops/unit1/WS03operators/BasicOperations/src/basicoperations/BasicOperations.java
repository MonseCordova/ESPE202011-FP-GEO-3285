/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicoperations;

import static java.time.Clock.system;

/**
 *
 * @author LENOVO
 */
public class BasicOperations {
    private static String addendl;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sum;
        int addend1;
        int addend2;
        int minuend; 
        int subtrahend; 
        int product;
        int multiplicant;
        int multiplier;
        int dividend; 
        int divisor;
        int quotient;
        int remanider;
        
        addend1 = 5;
        addend2 = 18;
        minuend = -23;
        subtrahend = -6;
        multiplicant = 8;
        multiplier = 10;
        dividend = 15;
        divisor = 9;
       
        sum = addend1 + addend2;
        
        System.out.println("the addition of " + addendl + " + " + addend2 + " is equal to --> " + sum);
        
        ++sum;
        System.out.println("sum is equal to --> " + sum);
        
        sum++;
        System.out.println("sum is equal to --> " + sum);
        
        System.out. println("adding one to sum "+ (sum++));
        
        System.out.println("adding one to sum " + ((++sum)));
        
        System.out.println("the substraction of " + minuend + " - " + subtrahend + " is equal to " + (minuend - subtrahend));
        
          product = multiplier * multiplicant;
        
        System.out.println("the multiplication of " + multiplier + " * " + multiplicant + " is equal to --> " + product);
        
         quotient = dividend / divisor ;
        
        System.out.println("the division of " + dividend + " / " + divisor + " is equal to --> " + quotient);
                
        remanider   = dividend % divisor ;
        
        System.out.println("the division remanider of " + dividend + " % " + divisor + " is equal to --> " + remanider);
        
    }
    
}
