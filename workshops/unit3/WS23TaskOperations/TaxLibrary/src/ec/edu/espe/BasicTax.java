

package ec.edu.espe;

/**
 *
 * @author LENOVO
 */
public class BasicTax {
 public static float computeIVA(float basePrice, float porcentagevalue) {
        float IVA;
        IVA = (basePrice * porcentagevalue) / 100;
        return IVA;
    }   
}
