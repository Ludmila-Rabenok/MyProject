package FlowerShop.flowers;

import FlowerShop.FlowerShop;
import FlowerShop.flowers.AFlower;

public class Pion extends AFlower {
    public Pion(String color, int price){
        super(color,price);

        setColor(color);
        setPrice(price);
    }
    public String toString() {
        return "Pion{" +
                "price ='" + getPrice() +
                " ,color ='" + getColor() +
                '\'' + "}";
    }
}
