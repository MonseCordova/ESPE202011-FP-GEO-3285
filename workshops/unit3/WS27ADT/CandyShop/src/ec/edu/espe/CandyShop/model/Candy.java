

package ec.edu.espe.CandyShop.model;

/**
 *
 * @author MonseCordova
 */
public class Candy {
   private String name;
   private String color;
   private String Taste;
   private String Form; 
   private String designTo;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    public Candy(String name, String color, String Taste, String Form, String designTo) {
        this.name = name;
        this.color = color;
        this.Taste = Taste;
        this.Form = Form;
        this.designTo = designTo;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the Taste
     */
    public String getTaste() {
        return Taste;
    }

    /**
     * @param Taste the Taste to set
     */
    public void setTaste(String Taste) {
        this.Taste = Taste;
    }

    /**
     * @return the Form
     */
    public String getForm() {
        return Form;
    }

    /**
     * @param Form the Form to set
     */
    public void setForm(String Form) {
        this.Form = Form;
    }

    /**
     * @return the designTo
     */
    public String getDesignTo() {
        return designTo;
    }

    /**
     * @param designTo the designTo to set
     */
    public void setDesignTo(String designTo) {
        this.designTo = designTo;
    }
} 


