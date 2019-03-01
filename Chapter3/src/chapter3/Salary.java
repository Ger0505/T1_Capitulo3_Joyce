package chapter3;

/**
 *
 * @author Gerardo A A
 */
public class Salary {
    
    public static void weeklySalary(Integer pay,Integer regular_hours,Integer extra_hours){
        Double extra_pay = extraHours(pay, regular_hours, extra_hours);
        System.out.println("$"+7*(regular_hours*pay+extra_pay));
    }
    
    private static Double extraHours(Integer pay,Integer regular_hours,Integer extra_hours){
        return (regular_hours+extra_hours)*pay*1.5;
    }
}
