package pregunta9;

public  abstract class SuperIntendente {
    protected SuperIntendente successor;

    public void setSuccessor(SuperIntendente successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);

}
