public class Ателье {
    public void одетьЖенщину(Одежда[] одежда) {
        System.out.println("Женская одежда:");
        for (Одежда item : одежда) {
            if (item instanceof ЖенскаяОдежда) {
                ((ЖенскаяОдежда) item).одетьЖенщину();
                System.out.println("Размер: " + item.размер);
                System.out.println("Стоимость: " + item.стоимость);
                System.out.println("Цвет: " + item.цвет);
            }
        }
    }

    public void одетьМужчину(Одежда[] одежда) {
        System.out.println("Мужская одежда:");
        for (Одежда item : одежда) {
            if (item instanceof МужскаяОдежда) {
                ((МужскаяОдежда) item).одетьМужчину();
                System.out.println("Размер: " + item.размер);
                System.out.println("Стоимость: " + item.стоимость);
                System.out.println("Цвет: " + item.цвет);
            }
        }
    }
}