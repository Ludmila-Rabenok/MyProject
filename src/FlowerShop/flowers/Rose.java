package FlowerShop.flowers;

import FlowerShop.FlowerShop;
import FlowerShop.flowers.AFlower;

public class Rose extends AFlower {

    public Rose(String color, int price){
        super(color,price);

        setColor(color);
        setPrice(price);
    }
    @Override
    public String toString() {
        return "Rose{" +
                "price ='" + getPrice() +
                " ,color ='" + getColor() +
                '\'' + "}";
    }
}
