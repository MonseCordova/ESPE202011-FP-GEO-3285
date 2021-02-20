package ws13.task;

import java.util.Scanner;

/**
 *
 * @author MonseCordova
 */
public class WS13Task {

    public static void main(String[] args) {
        int option;
        float radius;
        float circleArea = 0.0F;
        float base;
        float height;
        float triangleArea = 0.0F;
        float lenghtDiagonalA;
        float lenghtDiagonalB;
        float rhombusArea = 0.0F;
        float distance;
        float time;
        float speed = 0.0F;
        float massObject;
        float acceleration;
        float force = 0.0F;
        float potentialEnergy = 0.0F;
        float massObjectEnergy;
        float forcePower;
        float heightPower;

        do {
            printBanner();
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Please, enter radius value");
                    radius = input.nextInt();
                    circleArea = computeCircleArea(radius);
                    System.out.println("The circle area is: " + circleArea);
                    break;
                case 2:
                    System.out.println("Please, enter base value");
                    base = input.nextInt();
                    System.out.println("Please, enter height value");
                    height = input.nextInt();
                    triangleArea = computeTriangleArea(base, height);
                    System.out.println("The triangle value is: " + triangleArea);
                    break;
                case 3:
                    System.out.println("Please, enter Diagonal A value");
                    lenghtDiagonalA = input.nextInt();
                    System.out.println("Please, enter diagonal b value");
                    lenghtDiagonalB = input.nextInt();
                    rhombusArea = computeRhombusArea(lenghtDiagonalA, lenghtDiagonalB);
                    System.out.println("The area of the rhombus is: " + rhombusArea);
                    break;
                case 4:
                    System.out.println("Please, enter distance value in [m] ");
                    distance = input.nextInt();
                    System.out.println("Please, enter time value in [sec]");
                    time = input.nextInt();
                    speed = computeSpeed(distance, time);
                    System.out.println("The speed value is: " + speed + "[m/sec]");
                    break;
                case 5:
                    System.out.println("Please, enter distance value in [m] ");
                    massObject = input.nextInt();
                    System.out.println("Please, enter time value in [sec]");
                    acceleration = input.nextInt();
                    force = computeForce(massObject, acceleration);
                    System.out.println("Force is: " + force);
                    break;
                case 6:
                    System.out.println("Please, enter mass object value in [Kg] ");
                    massObjectEnergy = input.nextInt();
                    System.out.println("Please, enter height value in [m]");
                    heightPower = input.nextInt();
                    potentialEnergy = computePotentialEnergy(massObjectEnergy, heightPower);
                    System.out.println("The potential energy is: " + potentialEnergy);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
                case 0:
                    System.out.println("See you later");
                    System.exit(0);
                    break;
            }
        } while (option != 0);
    }

    public static float computePotentialEnergy(float massObjectEnergy, float heightPower) {
        float potentialEnergy;
        potentialEnergy = (float) (massObjectEnergy * 9.81 * heightPower);
        return potentialEnergy;
    }

    public static float computeForce(float massObject, float acceleration) {
        float force;
        force = massObject * acceleration;
        return force;
    }

    public static float computeSpeed(float distance, float time) {
        float speed;
        speed = distance / time;
        return speed;
    }

    public static float computeRhombusArea(float lenghtDiagonalA, float lenghtDiagonalB) {
        float rhombusArea;
        rhombusArea = (lenghtDiagonalA * lenghtDiagonalB) / 2;
        return rhombusArea;
    }

    public static float computeTriangleArea(float base, float height) {
        float triangleArea;
        triangleArea = (base * height) / 2;
        return triangleArea;
    }

    public static float computeCircleArea(float radius) {
        float circleArea;
        circleArea = (float) (Math.PI * (radius * radius));
        return circleArea;
    }

    public static void printBanner() {
        System.out.println("================================");
        System.out.println(" ***  Welcome User   *** \n  *** Choose one option  *** ");
        System.out.println(" * 1. Circle Area ");
        System.out.println(" * 2. Triangle Area ");
        System.out.println(" * 3. Rhombus Area ");
        System.out.println(" * 4. Speed ");
        System.out.println(" * 5. Force ");
        System.out.println(" * 6. Potential Energy ");
        System.out.println(" *** Press zero (0) to exit ***");
        System.out.println("=================================");
    }
}
