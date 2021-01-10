

package areatrapezoidshort;

/**
 *
 * @author LENOVO
 */
public class AreaTrapezoidShort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    short areatotal;
    short area1;
    short area2;
    short base1;
    short base2;
    short height1;
    short height2;
    
    base1 = 5;
    base2 = 8;
    height1 = 4;
    height2 = 2;
    
    area1 = (short) ((base1 * height1 )/2);
    area2 = (short) ((base2 * height2 )/2);
    areatotal = (short) ( area1 + area2 );
 
System.out.println( "The area of the trapezoid with with base 1 is " + base1
        + " and base 2 is " + base2 + "is equal to -->" + areatotal);

            
    
    }
    
}
