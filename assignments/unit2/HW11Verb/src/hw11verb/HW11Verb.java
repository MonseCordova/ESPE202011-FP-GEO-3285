package hw11verb;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class HW11Verb {

    private static int Show;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            option = printBanner(input);

            switch (option) {

                case 1:

                    do {
                        option = showStart(input);

                        switch (option) {

                            case 1:
                                do {
                                    option = Showmenu1(input);

                                    switch (option) {

                                        case 1:
                                            ShowConversionCordinatesToDecimals(input);
                                            break;

                                        case 2:
                                            ShowConversionCordinatesToDecimals2(input);
                                            break;

                                        case 0:
                                            printBye();
                                            break;
                                        default:
                                            printInvalidOption();
                                            break;

                                    }
                                } while (option != 2);

                            case 2:
                                do {
                                    option = ShowOption2Home(input);

                                    switch (option) {

                                        case 1:
                                            convertDecimalDegreesToUTMLongitude(input);
                                            break;

                                        case 2:
                                            ConvertDecimalDegreesToUTMLongitude(input);
                                            break;

                                        case 0:
                                            printBye();
                                            break;
                                        default:
                                            printInvalidOption();
                                            break;

                                    }
                                } while (option != 2);

                            case 0:
                                printBye();
                                break;
                            default:
                                printInvalidOption();
                                break;

                        }
                    } while (option != 2);

                case 2:
                    do {
                        printOption3Home1();
                        option = input.nextInt();

                        switch (option) {

                            case 1:
                                do {
                                    option = printPerimeterHome(input);

                                    switch (option) {

                                        case 1:
                                            CalculateAPerimeter(input);
                                            break;

                                        case 2:
                                            CalculateAPerimeter2(input);
                                            break;

                                        case 3:
                                            CalculateAPerimeter3(input);
                                            break;

                                        case 0:
                                            printBye();
                                            break;
                                        default:
                                            printInvalidOption();
                                            break;

                                    }
                                } while (option != 3);

                            case 2:

                                do {
                                    option = printAreaHome(input);

                                    switch (option) {

                                        case 1:
                                            CalculateAnArea(input);
                                            break;

                                        case 2:
                                            CalculateAnArea2(input);
                                            break;

                                        case 3:
                                            CalculateAnArea3(input);
                                            break;

                                        case 0:
                                            printBye();
                                            break;
                                        default:
                                            printInvalidOption();
                                            break;

                                    }
                                } while (option != 3);

                            case 0:
                                printBye();
                                break;
                            default:
                                printInvalidOption();
                                break;

                        }

                    } while (option != 6);

                case 0:
                    printExit();
                    break;
                default:
                    printInvalidOption();
                    break;
            }
        } while (option != 2);

    }

    public static int printBanner(Scanner input) {
        int option;
        System.out.println(""
                + "  =============================================================================================\n"
                + " | ******************************************************************************************* |\n"
                + " | *  =====================================================================================  * |\n"
                + " | * | 											   | * | \n"
                + " | * |  _____            _                              _     _        _   _      _        | * | \n"
                + " | * | /  __ \\          | |                            | |   (_)      | | | |    | |       | * |  \n"
                + " | * | | /  \\/ __ _ _ __| |_ ___   __ _ _ __ __ _ _ __ | |__  _  ___  | |_| | ___| |_ __   | * | \n"
                + " | * | | |    / _` | '__| __/ _ \\ / _` | '__/ _` | '_ \\| '_ \\| |/ __| |  _  |/ _ \\ | '_ \\  | * | \n"
                + " | * | | \\__/\\ (_| | |  | || (_) | (_| | | | (_| | |_) | | | | | (__  | | | |  __/ | |_) | | * | \n"
                + " | * |  \\____/\\__,_|_|   \\__\\___/ \\__, |_|  \\__,_| .__/|_| |_|_|\\___| \\_| |_/\\___|_| .__/  | * | \n"
                + " | * |                             __/ |         | |                               | |     | * | \n"
                + " | * |                            |___/          |_|                               |_|     | * | \n"
                + " | * | 											   | * | \n"
                + " | * |*************************************************************************************| * |\n"
                + " | * |		 Welcome to Cartographic Help to \"LOS GPS\"				   | * |\n"
                + " | * |  	 Please Choose the literal to Help You 		   			   | * |\n"
                + " | * |   	 1. ==> Coordinate Conversion				   		   | * |\n"
                + " | * |   	 2. ==> Surface Area and Perimeter Calculator		   		   | * |\n"
                + " | * |   	 0. ==> Exit						   		   | * |\n"
                + " | * |							 				   | * |\n"
                + " | *  =====================================================================================  * |\n"
                + " | ********************************************************************** \" LOS GPS \" ******** |\n"
                + "  =============================================================================================");
        option = input.nextInt();
        return option;
    }

    public static void printExit() {
        System.out.println("Thanks for using our Aplication ");
        System.out.println("Good Luck");
        System.exit(0);
    }

    private static int showStart(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ShowConversionCordinatesToDecimals(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void menu1(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ShowConversionCordinatesToDecimals2(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void printBye() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void printInvalidOption() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int ShowOption2Home(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void convertDecimalDegreesToUTMLongitude(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ConvertDecimalDegreesToUTMLongitude(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void printOption3Home1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int printPerimeterHome(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void CalculateAPerimeter(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void CalculateAPerimeter2(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void CalculateAPerimeter3(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void CalculateAnArea(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void CalculateAnArea2(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int printAreaHome(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void CalculateAnArea3(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int Showmenu1(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
