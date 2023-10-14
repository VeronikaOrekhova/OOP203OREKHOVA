import Colors.Color;
import Shapes.Circle;
import Shapes.Point;
import Shapes.Rectangle;
import Shapes.Triangle;
import java.util.ArrayList;
import Shapes.Shape;
import java.util.List;
import impl.ShapesServiceImpl;
import service.ShapesService;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /*ТОЧКА*/
        Point point = new Point(2, 1);
        point.draw();


        /*КРУГ*/
        Point point1 = new Point(2, 1);
        Circle circle = new Circle(point1, 1);
        circle.draw();
        //изменение
        circle.setColor(Color.RED);
        circle.setPoint(new Point(2, 2));
        circle.move(1, 1);
        circle.draw();



        /*ПРЯМОУГОЛЬНИК*/
        Point pointC = new Point(1, 3);
        Point pointP = new Point(4, 1);
        Rectangle rectangle = new Rectangle(pointC, pointP);
        rectangle.draw();
        //изменение
        rectangle.setColor(Color.BLUE);
        rectangle.setPointP(new Point(3, 6));
        rectangle.move(2, 1);
        rectangle.draw();



        /*ТРЕУГОЛЬНИК*/
        Point pointA = new Point();
        Point pointB = new Point();
        Point pointD = new Point();
        pointA.setX(10); // Устанавливаем значение X
        pointA.setY(20); // Устанавливаем значение Y
        pointB.setX(15); // Устанавливаем значение X
        pointB.setY(25); // Устанавливаем значение Y
        pointD.setX(12); // Устанавливаем значение X
        pointD.setY(35); // Устанавливаем значение Y
        Triangle triangle = new Triangle(pointA, pointB, pointD);
        triangle.draw();
        //изменение
        triangle.setColor(Color.PURPLE);
        triangle.setPointD(new Point(3, 6));
        triangle.move(3, 4);
        triangle.draw();

       System.out.println("ЗАДАНИЕ 2");
        List<Shape> shapes = new ArrayList<>();
        Point[] trianglePoints = {new Point(0, 0), new Point(0, 4), new Point(4, 0)};
        Triangle redTriangle = new Triangle(trianglePoints[0], trianglePoints[1], trianglePoints[2]);
        redTriangle.setColor(Color.RED);
        shapes.add(redTriangle);

        Circle whiteCircle = new Circle(new Point(3, 3), 2);
        whiteCircle.setColor(Color.WHITE);
        shapes.add(whiteCircle);

        Circle yellowCircle = new Circle(new Point(2, 5), 4);
        yellowCircle.setColor(Color.YELLOW);
        shapes.add(yellowCircle);

        Rectangle Rectangle = new Rectangle(new Point(1, 1), new Point(5, 2));
        Rectangle.setColor(Color.BLACK);
        shapes.add(Rectangle);

        Point Point = new Point(100, 100);
        shapes.add(Point);

        Point[] blueTrianglePoints = {new Point(-2, 3), new Point(4, 3), new Point(2, 5)};
        Triangle blueTriangle = new Triangle(blueTrianglePoints[0], blueTrianglePoints[1], blueTrianglePoints[2]);
        blueTriangle.setColor(Color.BLUE);
        shapes.add(blueTriangle);

        ShapesService shapesService = new ShapesServiceImpl();

        double squares = shapesService.getSquares(shapes);
        System.out.println("Total squares: " + squares);

        double maxPerimeter = shapesService.getMaxPerimeters(shapes);
        System.out.println("Maximum perimeter: " + maxPerimeter);

        Set<Color> colors = shapesService.getColors(shapes);
        System.out.println("Colors: " + colors);
        }
    }
