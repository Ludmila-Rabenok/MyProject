package FlowerShop;

import FlowerShop.flowers.AFlower;
import FlowerShop.flowers.Lily;
import FlowerShop.flowers.Pion;
import FlowerShop.flowers.Rose;

public class FlowerShop {
    private static Worker worker = new Worker();

    public static void main(String[] args) {
        AFlower rose = new Rose("red", 10);
        AFlower pion = new Pion("pink", 15);
        AFlower lily = new Lily("white", 12);

        Bouquet bouquet =  worker.createBouquet(rose, pion, lily);
        worker.printBouquet(bouquet);

        AFlower whiteRose =  new Rose("white",10);
        worker.addFlower(bouquet,  whiteRose);
        worker.printBouquet(bouquet);

        worker.removeFlower(bouquet, whiteRose);
        worker.removeFlower(bouquet, new Rose("red",10));

        worker.printBouquet(bouquet);


    }
}
