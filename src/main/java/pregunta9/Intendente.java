package pregunta9;

public class Intendente extends SuperIntendente {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Intendente aprueba resoluciones");
        } else {
            successor.handleRequest(request);
        }
    }
}
