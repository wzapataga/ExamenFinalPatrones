package pregunta1;

import java.awt.Color;

public class WhiteFinish extends Finish {
    private String description;
    
    public WhiteFinish() {
        this.color = Color.WHITE;
        this.price = 300;
        this.description = "Finish: White";
    }
    
      public String getDescription() {
        return description;
    }
}
