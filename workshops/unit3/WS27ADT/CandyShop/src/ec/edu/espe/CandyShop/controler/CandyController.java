package ec.edu.espe.CandyShop.controler;

import ec.edu.espe.CandyShop.model.Candy;
import utills.FileManager;

/**
 *
 * @author MonseCordova
 */
public class CandyController {
    
    public void send(Candy candy) {
        String data = candy.getName() + " , " + candy.getColor() + " , "
                + candy.getDesignTo() + " , " + candy.getForm()
                + " , " + candy.getTaste();
        FileManager.save(data, "Candies");
    }
    
}
