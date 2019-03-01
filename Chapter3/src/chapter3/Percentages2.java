package chapter3;

import java.util.Scanner;

/**
 *
 * @author Gerardo A A
 */
public class Percentages2 {

    public static void computePercent(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese primer valor:");
        Double a = scan.nextDouble();
        System.out.print("Ingrese segundo valor:");
        Double b = scan.nextDouble();
        System.out.println(a+" is "+((a*100)/b)+"% of "+b);
    }
    
}
