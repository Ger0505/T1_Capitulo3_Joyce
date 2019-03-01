package chapter3.gamezone;

import java.util.Scanner;

/**
 *
 * @author Gerardo A A
 */
public class TwoCharacters {
    public static void createCharacters(){
        Scanner scan = new Scanner(System.in);
        MyCharacter[] personaje = new MyCharacter[2];
        
        for(int i =0;i<2;i++){
            System.out.println("Personaje "+(i+1));
            System.out.print("Color: ");
            String color = scan.next();
            System.out.print("No. de ojos: ");
            int eyes = scan.nextInt();
            System.out.print("No. de vidas: ");
            int lives = scan.nextInt();
            personaje[i] = new MyCharacter(color,eyes,lives);   
        }
        showInfo(personaje);
    }
    
    private static void showInfo(MyCharacter[] per){
        for(MyCharacter pers: per){
            System.out.println("----------------");
            System.out.println("Color: "+pers.getColor());
            System.out.println("No. de ojos: "+pers.getEyes());
            System.out.println("No. de vidas: "+pers.getLives());
        }
    }
}
