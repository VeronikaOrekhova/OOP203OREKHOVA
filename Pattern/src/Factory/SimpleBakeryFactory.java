package Factory;

import Factory.*;

public class SimpleBakeryFactory {
    public static Bakery createBakery (BakeryTypes type) {
            Bakery bakery = null;

            switch (type) {
                case BREAD:
                    bakery = new Bread();
                    break;
                case MEATPASTY:
                    bakery= new MeatPasty();
                    break;
                case PASTRY:
                    bakery = new Pastry();
                    break;
                case BROWNIE:
                    bakery= new Brownie();
                    break;
            }

            return bakery;
        }
    }

