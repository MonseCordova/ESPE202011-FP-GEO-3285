=package ws010functions;

/**
 *
 * @author LENOVO
 */
public class WS010Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int divd = 5;
        int divr = 10;
        float quotient = 0;
        int x = 0;
        int y = 0;
        
        quotient = divideTwoNumbers(5, 10);
        System.out.println("Quotient of 5 and 10 is -->" + quotient);       
        y = f(3);
        System.out.println("3^2 = " + y);
        
        y = f(-3);
        System.out.println("3^2 = " + y);
        
        x = -1;
        y = f(x);
        System.out.println("the square of -> " + y + "<-");
    }

    public static float divideTwoNumbers(int diviend, int divisor) {
        float quotient = 0.0F;

        quotient = (float) diviend / divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;
        y = x * x;
        return y;
    }

    public static int g(int x) {
        int y = 0;
        y = x * x;
        return y;
    }
}
    
    
