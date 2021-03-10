

package ws21.functions;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Author: Monserrat Córdova \n \t Computers");

        float process;
        float timePerProcess;
        float processInTime;
        float proccesPerHour;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the process number");
        process = input.nextInt();
        System.out.println("Enter the time to make one process ");
        timePerProcess = input.nextInt();
        System.out.println("Enter the time for procesing");

        processInTime = computeProcess(process, timePerProcess);

        System.out.println("The process number in that time is: " + processInTime);
        proccesPerHour = computeProcessPerHour(timePerProcess);

        System.out.println("The procces that it will make in one hour is: " + proccesPerHour);

    }

    public static float computeProcess(float process, float timePerProcess) {
        float processInTime;
        processInTime = process * timePerProcess;
        return processInTime;
    }

    public static float computeProcessPerHour(float timePerProcess) {
        float processInHour;
        processInHour = (60)/timePerProcess;
        return processInHour;
    }
}
    
