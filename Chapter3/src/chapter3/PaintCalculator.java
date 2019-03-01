package chapter3;

import java.text.DecimalFormat;

/**
 *
 * @author Gerardo A A
 */
public class PaintCalculator {
    
    public static final Integer PAINTED_SQUARE_FEET = 350;
    public static final Integer PRICE_GALLON = 32;
    
    public static void paintWall(Integer lenght,Integer width, Integer height){
        Integer area = (2*width*height)+(2*lenght*height);
        Double gallons = getGallons(area);
        System.out.println("Area: "+area);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Gallones necesarios: "+df.format(gallons));
        System.out.println("Precio total: $"+Math.ceil(gallons)*PRICE_GALLON);
        
        
    }
    
    private static Double getGallons(Integer area){
        return (area/350.0);
    }
}
