package chapter3.caseproblems;

/**
 *
 * @author Gerardo A A
 */
public class SammysRentalPriceWithMethods {
    
    final static int COST_HOUR =40;
    
    public Integer getTimeRent(int minutes){
        showInfo(minutes);
        return minutes;
    }
    
    public static void lema(){
        System.out.println("Todo Barato en la playa!!!!!");
    }
    
    private void showInfo(int minutes){
        int hour = minutes/60;
        int min = minutes%60;
        System.out.println("Tiempo de alquiler: "+hour+" horas y "+min+" minutes");
        System.out.println("Pago total: $"+hour*COST_HOUR+min);
    }
    
}
