package hw04menus;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class HW04Menus {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
 System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Area of a rectagle field");
            System.out.println("2. -> Speed of a mobile");
            System.out.println("3. -> The height of a triangle");
            System.out.println("4. -> Division remiender");
            System.out.println("5. -> Square root");
            System.out.println("6. -> Exit");
            

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    float lenght;
                    float wide;
                    float area;
                    System.out.println("Area of a rectangle field"); 
                    System.out.println("Enter field lenght -> ");
                    lenght = input.nextFloat();
                    System.out.println("enter field wide -> ");
                    wide = input.nextFloat();
                    area = (float) lenght * wide;
                    System.out.println(" The area of the rectangle field  is --> " + area);
                    break;
                case 2:
                    
                    float speed;
                    float time;
                    float distance;
                    System.out.println("Enter the distance -> ");
                    distance = input.nextFloat();
                    System.out.println("Enter the time -> ");
                    time = input.nextFloat();
                    speed = distance/time;
                    System.out.println(" The speed is --> " + speed);
                     break;
                case 3:
                    System.out.println("The height of a triangle");
                    float side;
                    float height;
                    
                    System.out.println("Enter side -> ");
                    side = input.nextFloat();
                    height = (float) ((Math.sqrt(3)/2)*side);
                    System.out.println(" The height is --> " + height);
                    break;
                case 4:
                    System.out.println("The division is");
                    float remainder;
                    float divisor;
                    float dividend;
                    System.out.println("enter divisor -> ");
                    divisor = input.nextFloat();
                    System.out.println("enter dividend -> ");
                    dividend = input.nextFloat();
                    remainder = dividend % divisor;
                    System.out.println(" the remiender is --> " + remainder);
                    break;
                case 5:
                    System.out.println("Square Root");
                    float number2;
                    float root;
                    System.out.println("enter a number -> "); 
                    number2 = input.nextFloat();
                    root = (float) Math.sqrt(number2);
                    
                case 6:
                    System.out.println("See you Later");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 6);

    }

}
