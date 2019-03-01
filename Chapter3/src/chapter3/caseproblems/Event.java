package chapter3.caseproblems;

/**
 *
 * @author Gerardo A A
 */
public class Event {
    public static final Integer PRICE_PER_GUEST = 35;
    public static final Integer LARGE_EVENT = 50;
    
    private String event_number;
    private Integer guests;
    private Integer price;
    
    public void setEventNumber(String number){
        this.event_number = number;
    }
    
    public void setGuests(Integer guests){
        this.guests = guests;
        this.price = guests*PRICE_PER_GUEST;
    }

    public String getEvent_number() {
        return event_number;
    }

    public Integer getGuests() {
        return guests;
    }

    public Integer getPrice() {
        return price;
    }
    
    
    
}
