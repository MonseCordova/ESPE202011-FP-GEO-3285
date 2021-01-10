package areatrapezoidfloat;

/**
 *
 * @author LENOVO
 */
public class AreaTrapezoidFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float areatotal;
    float  area1;
    float  area2;
    float base1;
    float base2;
    float height1;
    float height2;
    
    base1 = (float) 20.5 ;
    base2 = (float) 10.5;
    height1 = (float) 15.2;
    height2 = (float) 8.3;
    
    area1 = (float) ((base1 * height1 )/2);
    area2 = (float ) ((base2 * height2 )/2);
    areatotal = (float) ( area1 + area2 );
 
System.out.println( "The area of the trapezoid with with base 1 is " + base1
        + " and base 2 is " + base2 + "is equal to -->" + areatotal);
    }
    
}
