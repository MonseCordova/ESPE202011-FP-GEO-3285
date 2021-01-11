

package ws04.logicaloperators;

/**
 *
 * @author LENOVO
 */
public class WS04LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int x = 8;
        if (x != 8) {
            System.out.println("x is equals to 8");
        } else {
            System.out.println("x is NOT equal to 8");
        }

        boolean y = x != 8;
        System.out.println("x != 8 --> " + (y));
        System.out.println("x == 8 --> " + (x == 8));
        System.out.println("x = 4 -->   " + (x = 4));
        System.out.println("x > 4 -->  " + (x > 4));
        System.out.println("x >= 4 --> " + (x >= 4));

        boolean comparison = false;
        boolean comparison2 = false;
        boolean comparison3 = false;
        comparison = x != 8;
        System.out.println("comparison -> " + comparison);

        comparison2 = x >= 4;
        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        System.out.println("comparison2 -> " + comparison2);

        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);

        System.out.println("Juana Cordova AND TRUTH TABLE odd numbers ->"
                + " &&  even numbers ->||");
        System.out.println("=================================================");
        boolean p;
        boolean q;

        p = true;
        q = true;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p || q));
        
        p = true; 
        q = false;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p || q));
        
        p = true;
        q = false;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p || q));
        
        p = false;
        q = false;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p || q));
       
              
    }
        
    }
    

