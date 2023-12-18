package Factory;

import Factory.Bakery;

public class BakeryShop {
    private final SimpleBakeryFactory bakeryFactory;

    public BakeryShop(SimpleBakeryFactory bakeryFactory) {
        this.bakeryFactory = bakeryFactory;
    }

    public Bakery orderBakery(BakeryTypes type) {
        Bakery bakery = bakeryFactory.createBakery(type);

        bakery.makeDough();
        bakery.makeFilling();
        bakery.collect();
        bakery. bake();

        System.out.println("Вот ваша выпечка! Спасибо, приходите еще!");
        return bakery;
    }
}

