
package areatrapezoidint;

/**
 *
 * @author LENOVO
 */
public class AreaTrapezoidInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int areatotal;
    int area1;
    int area2;
    int base1;
    int base2;
    int height1;
    int height2;
    
    base1 = 15;
    base2 = 9;
    height1 = 20;
    height2 = 8;
    
    area1 = (int) ((base1 * height1 )/2);
    area2 = (int) ((base2 * height2 )/2);
    areatotal = (int) ( area1 + area2 );
 
System.out.println( "The area of the trapezoid with with base 1 is " + base1
        + " and base 2 is " + base2 + "is equal to -->" + areatotal);
    }
    
}
