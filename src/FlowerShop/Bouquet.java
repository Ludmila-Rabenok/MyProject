package FlowerShop;

import FlowerShop.flowers.AFlower;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<AFlower> flowers = new ArrayList<>();
    private Integer price;

    public List<AFlower> getFlowers() {
        return flowers;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public String toString() {
        return "Bouquet{" +
                "flowers ='" + flowers +
                " ,total  price ='" + price + "}";
    }
}