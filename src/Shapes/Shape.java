package Shapes;
import Colors.Color;


public abstract class Shape {
    private double Perimeter;
    private double Area;

    public  double getArea() {
        return 0.0;
    }

    public double getPerimeter() {

        return 0.0;
    }
    private Color color = Color.TRANSPARENT; // делаем приватную переменную колор, создаем метод гет, чтобы получать значение переменной и чтобы извне никто ее не "изменил"

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    } // создаем метод сет колор, чтобы можно было поменять значение колор

    private double centerX;
    private double centerY;
    public void move(double moveX, double moveY) {
            this.centerX += moveX;
            this.centerY += moveY;
    }

    public void draw() {
        System.out.println("Название фигуры: ");
        System.out.println("Цвет фигуры: + color ");
        System.out.println("Center coordinates: (" + centerX + ", " + centerY + ")");
        System.out.println("Площадь фигуры: " + getArea());
        System.out.println("Периметр фигуры:" +getPerimeter());

    }
}