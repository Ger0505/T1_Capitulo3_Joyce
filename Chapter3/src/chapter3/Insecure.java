package chapter3;

/**
 *
 * @author Gerardo A A
 */
public class Insecure {
    public static void premium(int currently_year,int birth_year){
        int edad = birth_year-currently_year;
        System.out.println("$"+(edad/10+15)*20);
    }
}
