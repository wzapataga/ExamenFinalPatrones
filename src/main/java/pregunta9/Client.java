package pregunta9;

public class Client {
    public static void main(String[] args) {
        SuperIntendente Intendente = new Intendente();
   
        Intendente.setSuccessor(Intendente);
        

        Request request = new Request(RequestType.CONFERENCE, 500);
        Intendente.handleRequest(request);

       
    }
}
