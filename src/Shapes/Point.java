package Shapes;
import Colors.Color;

public class Point extends Shape {
     //без параметров
     public Point() {
     }
     //конструктор с параметрами
     public Point(double x, double y) {
         this.x = x;
         this.y = y;
     }
     private double x;
     private double y;


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
     public void setX(double x) {
         this.x = x;
     }

     public void setY(double y) {
         this.y = y;
     }


     @Override
     public  double getArea() {return 0.0;}

     @Override
     public double getPerimeter() {
         return 0.0;
     }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }
    public double distanceTo(Point otherPoint) {
        // Реализация расчета расстояния между двумя точками
        double dx = otherPoint.getX() - x;
        double dy = otherPoint.getY() - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    @Override
    public void move(double moveX, double moveY) {
        this.x += moveX;
        this.y += moveY;
        System.out.println("Координаты точки: (" + x + ", " + y + ")");;
    }

    @Override
    public void draw()
        { System.out.println("Название фигуры: ТОЧКА ");
            System.out.println("Площадь фигуры: " + getArea());
            System.out.println("Периметр фигуры:" +getPerimeter());
            System.out.println("Точка с координатами: (" + x + ", " + y + ")");
        }
}


