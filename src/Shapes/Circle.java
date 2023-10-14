package Shapes;
import Shapes.Shape;
import Colors.Color;

public class Circle extends Shape {
    private Point point ;
    private double radius;
    private Color color = Color.TRANSPARENT;
    public Circle (Point point, double radius){
        this.point = point;
        this.radius = radius;
        validate();
    }
    public Circle() {
        this.point = new Point(0, 0);
        this.radius = 0;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        validate();
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void move(double dx, double dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
        System.out.println("Круг сдвинулся на: (" + dx + ", " + dy + ")");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    // Private метод validate для проверки радиуса
    private void validate() {
        if (radius <= 0) {
            throw new IllegalArgumentException("Не удалось создать фигуру, т.к. радиус не может быть меньше или равен нулю");
        }
    }

    @Override
    public void draw() {
        System.out.println("Название фигуры: КРУГ ");
        System.out.println("Цвет фигуры:" + color );
        System.out.println(" - Центр: (" + point.getX() + ", " + point.getY() + ")");
        System.out.println(" - Радиус: " + radius);
        System.out.println("Площадь фигуры: " + getArea());
        System.out.println("Периметр фигуры:" +getPerimeter());
    }


}
