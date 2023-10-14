package Shapes;

import Colors.Color;

public class Triangle extends Shape{

    private Point pointA;
    private Point pointB;
    private Point pointD;
    private Color color = Color.TRANSPARENT;
    public Triangle() {} // без параметров
    public Triangle( Point pointA, Point pointB, Point pointD ) {
        this.pointA =  pointA;
        this.pointB =  pointB;
        this.pointD =  pointD;
        validateTriangle();
    }

    public Point getPointA() {return pointA;}
    public Point getPointB() {return pointB;}
    public Point getPointD() {return pointD;}

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }
    // Метод проверки, что все три точки не лежат на одной прямой
    public boolean validateTriangle() {
        double slopeAB = (pointB.getY() - pointA.getY()) / (pointB.getX() - pointA.getX());
        double slopeAD = (pointD.getY() - pointA.getY()) / (pointD.getX() - pointA.getX());
        return slopeAB != slopeAD;
    }
    @Override
    public double getArea() {
        // Реализуем расчет площади по формуле Герона
        double a = pointA.distanceTo(pointB);
        double b = pointB.distanceTo(pointD);
        double c = pointD.distanceTo(pointA);
        double p = (a + b + c) / 2; // Полупериметр
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        double a = pointA.distanceTo(pointB);
        double b = pointB.distanceTo(pointD);
        double c = pointD.distanceTo(pointA);
        return a + b + c;
    }

    @Override
    public void move(double moveX, double moveY) {
// Сдвигаем каждую точку на заданные значения
        pointA.move(moveX, moveY);
        pointB.move(moveX, moveY);
        pointD.move(moveX, moveY);
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
    public void draw() {
        System.out.println("Название фигуры: ТРЕУГОЛЬНИК ");
        System.out.println("Цвет фигуры:" + color );
        System.out.println("Площадь фигуры: " + getArea());
        System.out.println("Периметр фигуры:" +getPerimeter());
    }
}
