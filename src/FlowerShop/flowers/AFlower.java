package FlowerShop.flowers;

import FlowerShop.FlowerShop;

public abstract class AFlower {
    private String color;
    private Integer price;

    public AFlower(String color, Integer price)  { this.color =  color;  this.price = price; }

    public String getColor() {
        return color;
    }

    public void setColor(String color){ this.color = color;}

    public Integer getPrice() {return price;}

    public void setPrice(Integer price) { this.price = price;}

    @Override
    public String toString() {
        return "Flower{" +
                "price ='" + price +
                " ,color ='" + color +
                '\'' + "}";
    }
}
