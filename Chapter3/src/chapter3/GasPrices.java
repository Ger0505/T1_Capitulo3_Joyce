package chapter3;

/**
 *
 * @author Gerardo A A
 */
public class GasPrices {
   final static float MIN_PRICE = 0.035f; 
   final static float MAX_PRICE = 0.04f; 
   
   public static void pricesPerGallon(Integer price_barrel){
       float min = price_barrel*MIN_PRICE;
       float max = price_barrel*MAX_PRICE;
       System.out.println(String.format("Price per gallon between $%.2f - $%.2f",min,max));
       
   }
}