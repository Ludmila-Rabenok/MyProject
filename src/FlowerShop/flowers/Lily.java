package FlowerShop.flowers;

import FlowerShop.FlowerShop;

public class Lily extends AFlower{
    public Lily(String color, int price){
        super(color,price);

        setColor(color);
        setPrice(price);
    }
    public String toString() {
        return "Lily{" +
                "price ='" + getPrice() +
                " ,color ='" + getColor() +
                '\'' + "}";
    }
}
