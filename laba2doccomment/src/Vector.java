/**@author OrehovaVeronika
 * @version 1.0
 * @since 2023-10-1
 */
public class Vector {
    private double x1;  // x1 y1 - координаты начала вектора
    private double y1;
    private double x2; // x2 y2 - координаты конца вектора
    private double y2;

    /**-    Конструктор класса Vector без параметров.
     -  ничего не делает, так как не имеет кода внутри тело метода.*/
    public Vector() {};

   /**- Конструктор класса Vector, принимающий начальные и конечные координаты вектора.
    - Задает значения начальных и конечных координат вектора на основе переданных аргументов.*/
   public Vector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


   /**- Вычисляет скалярное произведение векторов.
    - Умножает соответствующие координаты текущего вектора и переданного вектора other, а затем суммирует их результаты.
    - Возвращает полученное скалярное произведение.*/
   public double calculateSalarProduct(Vector other) {
        double scalarProduct = x1 * other.getX1() + y1 * other.getY1();
        scalarProduct += x2 * other.getX2() + y2 * other.getY2();
        return scalarProduct;
    }

    /**- Вычисляет векторное произведение векторов.
     - Вычисляет координаты векторного произведения, используя формулу для двумерного пространства.
     - Возвращает новый объект Vector с начальными координатами (0, 0) и вычисленными конечными координатами.*/
    public Vector calculateVectorProduct(Vector other) {
        double crossProductX = y1 * other.getY2() - y2 * other.getY1();
        double crossProductY = -(x1 * other.getX2() - x2 * other.getX1());
        return new Vector(0, 0, crossProductX, crossProductY);
    }
/**- Вычисляет длину вектора.
 - Вычисляет разность координат по осям x и y, возводит их в квадрат, суммирует результаты и извлекает квадратный корень из суммы.
 - Возвращает полученную длину вектора.*/

    public double calculateLength() {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
/**- Умножает вектор на скалярное значение.
 - Умножает каждую координату текущего вектора на заданное скалярное значение scalar.
 - Возвращает новый объект Vector с вычисленными координатами.*/

    public Vector multiplyByScalar(double scalar) {
        double newX1 = x1 * scalar;
        double newY1 = y1 * scalar;
        double newX2 = x2 * scalar;
        double newY2 = y2 * scalar;
        return new Vector(newX1, newY1, newX2, newY2);
    }
/**- Вычисляет сумму двух векторов.
 - Складывает соответствующие координаты текущего вектора и переданного вектора other.
 - Возвращает новый объект Vector с вычисленными координатами.*/
    public Vector getSum(Vector other) {
        double newX1 = x1 + other.x1;
        double newY1 = y1 + other.y1;
        double newX2 = x2 + other.x2;
        double newY2 = y2 + other.y2;
        return new Vector(newX1, newY1, newX2, newY2);
    }
/**- Вычисляет разность двух векторов.
 - Вычитает соответствующие координаты текущего вектора и переданного вектора other.
 - Возвращает новый объект Vector с вычисленными координатами.*/

    public Vector getDifference(Vector other) {
        double newX1 = x1 - other.x1;
        double newY1 = y1 - other.y1;
        double newX2 = x2 - other.x2;
        double newY2 = y2 - other.y2;
        return new Vector(newX1, newY1, newX2, newY2);
    }
/**- Устанавливают значения начальных и конечных координат вектора на основе переданных аргументов.
*/
 public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }
/**- Возвращают соответствующие координаты вектора.*/
    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }
/**- Возвращает строковое представление объекта Vector, содержащее значения всех координат.*/
    @Override
    public String toString() {
        return "Vector{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';

    }
}