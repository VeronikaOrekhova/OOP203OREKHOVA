
public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector();
        Vector vec1 = new Vector(0.0, 0.0, 3.0, 4.0);
        Vector vec2 = new Vector(-2.0, 1.0, 5.0, 6.0);
        vec1.multiplyByScalar(3);
        vec2.calculateLength();
        vec1.getSum(vec2);
        vec2.getDifference(vec1);
        vec1.calculateSalarProduct(vec2);
        vec2.calculateVectorProduct(vec2);
        System.out.println("Скалярное произведение vec1 на vec2:"+vec1.calculateSalarProduct(vec2));
        System.out.println("Векторное произведение vec2 на vec1:"+vec2.calculateVectorProduct(vec2));
        System.out.println("Длина vec1:"+vec2.calculateLength());
        System.out.println("Умножение vec1 на число 3:"+vec1.multiplyByScalar(3));
        System.out.println("Cумма векторов vec1 + vec2:"+vec1.getSum(vec2));
        System.out.println("Cумма векторов vec2 - vec2:"+vec2.getDifference(vec1));

        System.out.println("РАБОТА 2!");
        Одежда[] одежда = new Одежда[4];
        одежда[0] = new Футболка();
        одежда[1] = new Брюки();
        одежда[2] = new Юбка();
        одежда[3] = new Галстук();

        Ателье ателье = new Ателье();
        ателье.одетьЖенщину(одежда);
        System.out.println();
        ателье.одетьМужчину(одежда);
        }
    }
