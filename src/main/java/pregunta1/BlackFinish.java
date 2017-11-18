package pregunta1;

import java.awt.Color;

public class BlackFinish extends Finish {

    private String description;
    
    public BlackFinish() {
        this.color = Color.BLACK;
        this.price = 400;
        this.description = "Finish: Black";
    }
    
    public String getDescription() {
        return description;
    }
}
