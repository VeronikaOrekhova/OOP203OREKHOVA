public class Футболка extends Одежда implements МужскаяОдежда, ЖенскаяОдежда {
    @Override
    public void одетьМужчину() {
        System.out.println("Одеваем мужчину в футболку");
    }

    @Override
    public void одетьЖенщину() {
        System.out.println("Одеваем женщину в футболку");
    }
}