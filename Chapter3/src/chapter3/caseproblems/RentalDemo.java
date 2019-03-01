package chapter3.caseproblems;

/**
 *
 * @author Gerardo A A
 */
public class RentalDemo {
    private Rental renta;

    public RentalDemo(Rental renta) {
        this.renta = renta;
    }
    
    public void showInfo(){
        SammysRentalPriceWithMethods.lema();
        System.out.println("No. de contacto: "+renta.getContact_number());
        System.out.println("Tiempo de alquiler: "+renta.getHours_rental()+" horas y "+renta.getExtra_minutes()+" minutes");
        System.out.println("Pago total: $"+renta.getPrice());
    }
    
}
