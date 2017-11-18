package pregunta1;

public abstract class Memory {
    protected MemoryType type;
    protected MemorySize size;
    protected MemorySpeed frequency;
    protected float price;

    public MemoryType getType() {
        return type;
    }

    public MemorySize getSize() {
        return size;
    }

    public MemorySpeed getFrequency() {
        return frequency;
    }

    public float getPrice() {
        return price;
    }
    
    public String toString() {
        return this.type.toString() + " | " + this.size.toString() + " | " + this.frequency.toString() + " | " + this.price;
    }
    
    public abstract String getDescription();
}
