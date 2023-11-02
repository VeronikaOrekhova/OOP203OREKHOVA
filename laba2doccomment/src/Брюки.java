public class Брюки extends Одежда implements МужскаяОдежда, ЖенскаяОдежда {
    @Override
    public void одетьМужчину() {
        System.out.println("Одеваем мужчину в брюки");
    }

    @Override
    public void одетьЖенщину() {
        System.out.println("Одеваем женщину в брюки");
    }
}