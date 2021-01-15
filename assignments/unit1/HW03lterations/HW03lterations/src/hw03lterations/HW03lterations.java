package hw03lterations;
/**
 *
 * @author LENOVO
 */
public class HW03lterations {
    public static void main(String[] args) {
   
        int number;
                
        number = 1;
        
         System.out.println("==== This is a while loop to from1 to 16 ====");
                 
        while ( number <= 16 ){
        
            System.out.println( "The number is --> " + (number) );
            number++;
    }      
   
    System.out.println("Multiplication Tables : 16");
        int top=12;
        int product=0;
        int table = 16;
        for (int n = 1 ; n <= top ; n++){
            product = table * n;
            System.out.println("16 * " + n + " = " + product); 
        }
        System.out.println("First 10 mutiples of 3");
        int multiples; 
        multiples  = 3;
        
        
        while ( multiples <= 30){
            System.out.println(multiples + " --> is a 3 multiple");
            multiples+=3;
        }
        
     
       
        
    }
    
}
