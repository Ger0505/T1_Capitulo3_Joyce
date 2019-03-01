package chapter3;

/**
 *
 * @author Gerardo A A
 */
public class Sandwich {
    private String ingredient;
    private String type_bread;
    private Double price;
    
    public Sandwich(String ingredient,String type_bread,Double price){
        this.ingredient = ingredient;
        this.type_bread = type_bread;
        this.price = price;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getType_bread() {
        return type_bread;
    }

    public void setType_bread(String type_bread) {
        this.type_bread = type_bread;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    
    
}
