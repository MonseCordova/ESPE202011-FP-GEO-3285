package ws13.task;

import java.util.Scanner;

/**
 *
 * @author MonseCordova
 */
public class WS13Task {

    public static void main(String[] args) {

        System.out.println("Circle Area");
        float circleArea = 0.0F;
        float radius;
        System.out.println("Enter the radius");
        Scanner input = new Scanner(System.in);
        radius = input.nextInt();
        circleArea = calculeCircleArea(radius);
        System.out.println("Circle area is " + circleArea);

        System.out.println("Rombo Area");
        float diagonal;
        float diagonal2;
        float area = 0.0F;
        System.out.println("Enter big diagonal");
        diagonal = input.nextInt();
        System.out.println("Enter short diagonal");
        diagonal2 = input.nextInt();
        area = calculateRombo(diagonal, diagonal2);
        System.out.println("The area is " + area);

        System.out.println("Triangle Area");
        float areaTriangle = 0.0F;
        float base;
        float height;
        System.out.println("Enter base");
        base = input.nextInt();
        System.out.println("Enter height");
        height = input.nextInt();
        area = calculateriangle(base, height);
        System.out.println("The area is " + area);

        System.out.println("Physc Equations");
        System.out.println("Velocity");
        float time;
        float distance;
        float speed = 0.0F;
        System.out.println("Enter distance");
        distance = input.nextInt();
        System.out.println("Eneter time");
        time = input.nextInt();
        speed = findSpeed(distance, time);
        System.out.println("Speed is " + speed);

        System.out.println("Force");
        float force = 0.0F;
        float mass;
        float acceleration;
        System.out.println("Enter mass");
        mass = input.nextInt();
        System.out.println("Eneter acceleration");
        acceleration = input.nextInt();
        force = findForce(mass, acceleration);
        System.out.println("Force is equal to --> " + force);

    }

    public static float findForce(float mass, float acceleration) {
        return mass * acceleration;
    }

    public static float findSpeed(float distance, float time) {
        return distance / time;
    }

    public static float calculateriangle(float base, float height) {
        return findSpeed(findForce(base, height), 2);
    }

    public static float calculateRombo(float diagonal, float diagonal2) {
        float area;
        area = findSpeed(findForce(diagonal, diagonal2), 2);
        return area;
    }

    public static float calculeCircleArea(float radius) {
        float circleArea;
        circleArea = (float) (findForce((float) Math.PI, radius * radius));
        return circleArea;
    }

}
