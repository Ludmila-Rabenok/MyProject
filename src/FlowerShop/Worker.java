package FlowerShop;

import FlowerShop.flowers.AFlower;

import java.util.Collections;

public class Worker {

    public Bouquet  createBouquet(AFlower...flowers){
        Bouquet  bouquet = new Bouquet();
        Collections.addAll(bouquet.getFlowers(),flowers);
        bouquet.setPrice(calculatePrice(bouquet));
        return bouquet;
    }
    public void addFlower(Bouquet bouquet, AFlower flower){
        bouquet.getFlowers().add(flower);
        int price = bouquet.getPrice() + flower.getPrice();
        bouquet.setPrice(price);
    }
    public void removeFlower(Bouquet bouquet,AFlower flower){
        bouquet.getFlowers().remove(flower);
        int price = bouquet.getPrice() - flower.getPrice();
        bouquet.setPrice(price);
    }
    private int calculatePrice(Bouquet bouquet){
        return bouquet.getFlowers().stream()
                .map(AFlower::getPrice)
                .mapToInt(x->x)
                .sum();
    }
    public void printBouquet(Bouquet bouquet){
        System.out.println(bouquet);
        System.out.println("Количество цветов в букете - " + bouquet.getFlowers().size());
        System.out.println("Стоимость букета - " + bouquet.getPrice());
    }

}
