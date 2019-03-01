package chapter3.caseproblems;

/**
 *
 * @author Gerardo A A
 */
public class Rental {
    public static final int MINUTES_PER_HOUR=60;
    public static final int HOURLY_RATE = 40;
    
    private String contact_number;
    private int hours_rental;
    private int extra_minutes;
    private int price;

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public void setHoursAndMinutes(int minutes) {
        this.hours_rental = minutes/60;
        this.extra_minutes = minutes%60;
        this.price = this.hours_rental*HOURLY_RATE+this.extra_minutes;
    }

    public String getContact_number() {
        return contact_number;
    }

    public int getHours_rental() {
        return hours_rental;
    }

    public int getExtra_minutes() {
        return extra_minutes;
    }

    public int getPrice() {
        return price;
    }
    
    
}
