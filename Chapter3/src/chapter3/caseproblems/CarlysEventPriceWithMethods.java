package chapter3.caseproblems;

/**
 *
 * @author Gerardo A A
 */
public class CarlysEventPriceWithMethods {
     final static int PRECIO_X_INVITADO = 35;
     public static final String lema ="Lo nuestro es la Pary Loca!";
    
    public CarlysEventPriceWithMethods(Integer invitados ) {
        System.out.println(lema);
        System.out.println("No. de invitados: "+invitados);
        System.out.println("Costo por invitado:   $"+PRECIO_X_INVITADO);
        System.out.println("Precio Total: $"+(invitados*PRECIO_X_INVITADO));
        System.out.println("Evento Grande: "+(invitados>=50 ? true:false));
    }
    
    public static int getGuest(int guests){
        return guests;
    }
    
    public static void lema(){
        System.out.println(lema);
    }
    
    public static void costoEvento(int guests){
        System.out.println("No. de invitados: "+guests);
        System.out.println("Costo por invitado:   $"+PRECIO_X_INVITADO);
        System.out.println("Precio Total: $"+(guests*PRECIO_X_INVITADO));
        System.out.println("Evento Grande: "+(guests>=50 ? true:false));
    }
}
