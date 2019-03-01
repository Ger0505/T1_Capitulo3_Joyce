package chapter3;

/**
 *
 * @author Gerardo A A
 */
public class Student {
    private Integer ID;
    private Integer credit_hours;
    private Integer number_point;
    private Double average;
    
    public Student(){
        this.ID = 9999;
        this.credit_hours = 3;
        this.number_point = 12;
        average();
    }

    public Student(Integer ID, Integer credit_hours, Integer number_point) {
        this.ID = ID;
        this.credit_hours = credit_hours;
        this.number_point = number_point;
        average();
    }
    
    private void average(){
        this.average = (double)this.number_point/this.credit_hours;
    }

    public Integer getID() {
        return ID;
    }

    public Integer getCredit_hours() {
        return credit_hours;
    }

    public Integer getNumber_point() {
        return number_point;
    }

    public Double getAverage() {
        return average;
    }
    
    
    
}
