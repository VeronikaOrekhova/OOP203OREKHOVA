package Shapes;
import Shapes.Point;
import Colors.Color;

public class Rectangle extends Shape {
    private Point pointC;
    private Point pointP;
    private Color color = Color.TRANSPARENT;
    public Rectangle() {} // без параметров
    public Rectangle( Point pointC, Point pointP ) {
        this.pointC =  pointC;
        this.pointP =  pointP;
        validate();
    }


    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
        validate();
    }
    public Point getPointP() {
        return pointP;
    }

    public void setPointP(Point pointP) {
        this.pointP = pointP;
        validate();
    }

    @Override
    public double getArea() {
        double width = Math.abs(pointC.getX() - pointP.getX());
        double height = Math.abs(pointC.getY() - pointP.getY());
        return width * height;
    }

    @Override
    public double getPerimeter() {
        double width = Math.abs(pointC.getX() - pointP.getX());
        double height = Math.abs(pointC.getY() - pointP.getY());
        return 2 * (width + height);
    }

    private void validate() {
        if (pointC.getX() == pointP.getX() && pointC.getY() == pointP.getY()) {
            throw new RuntimeException("Не удалось создать фигуру: точки совпадают");
        }
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
    public void move(double moveX, double moveY) {
        pointC.setX(pointC.getX() + moveX);
        pointC.setY(pointC.getY() + moveY);
        pointP.setX(pointP.getX() + moveX);
        pointP.setY(pointP.getY() + moveY);
    }

    @Override
    public void draw() {
        System.out.println("Название фигуры: ПРЯМОУГОЛЬНИК ");
        System.out.println("Цвет фигуры:" + color );
        System.out.println("Площадь фигуры: " + getArea());
        System.out.println("Периметр фигуры:" +getPerimeter());
    }
}