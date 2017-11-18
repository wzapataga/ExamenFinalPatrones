package pregunta1;

import java.awt.Color;

public abstract class Finish {
    protected Color color;
    protected float price;
    protected String description;
    
    public Color getColor() {
        return color;
    }
    
    public float getPrice() {
        return price;
    }
        
    public String toString() {
        return  this.description + " | " + this.price;
    }
    
    public abstract String getDescription(); 
}
