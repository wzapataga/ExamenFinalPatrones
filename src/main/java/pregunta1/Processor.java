package pregunta1;

public abstract class Processor {
    protected ProcessorType type;
    protected ProcessorFrequency frequency;
    protected float price;
    
    public ProcessorType getType() {
        return type;
    }
    
    public ProcessorFrequency getFrequency() {
        return frequency;
    }
    
    public float getPrice() {
        return price;
    }
    
    public String toString() {
        return this.type.toString() + " | " + this.frequency.toString() + " | " + this.price;
    }
    
    public abstract String getDescription();
}
