package chapter3.caseproblems;

/**
 *
 * @author Gerardo A A
 */
public class EventDemo {
    private Event evento;
    
    public void setEvento(Event evento){
        this.evento = evento;
    }
    
    public void showInfo(){
        CarlysEventPriceWithMethods.lema();
        System.out.println("No. de evento: "+evento.getEvent_number());
        CarlysEventPriceWithMethods.costoEvento(500);
    }
}
