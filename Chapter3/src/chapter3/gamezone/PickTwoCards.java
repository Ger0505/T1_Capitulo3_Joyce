package chapter3.gamezone;

/**
 *
 * @author Gerardo A A
 */
public class PickTwoCards {
    public static void pickTwoCards(){
        Card card1 = new Card();
        Card card2 = new Card();
        showCards(card1);
        showCards(card2);
        
    }
    
    private static void showCards(Card card){
        System.out.println("---------------");
        System.out.println(card.getTipo());
        System.out.println(card.getValor());
    }
}
