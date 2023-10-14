package impl;
import java.util.*;
import Colors.Color;
import Shapes.Shape;
import service.ShapesService;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;


public class ShapesServiceImpl implements ShapesService {

    @Override
    public double getSquares(List<Shape> shapeList) {
        double sum = 0.0;
        for (Shape shape : shapeList) {
            sum += shape.getArea();
        }
        return sum;
    }

    @Override
        public double getMaxPerimeters (List < Shape > shapeList) {
            double maxPerimeter = 0;
            for (Shape shape : shapeList) {
                if (shape.getPerimeter() > maxPerimeter) {
                    maxPerimeter = shape.getPerimeter();
                }
            }
            return maxPerimeter;
        }

    @Override
    public Set<Color> getColors(List<Shape> shapeList) {
        Set<Color> colors = new HashSet<>();

        for (Shape shape : shapeList) {
            colors.add(shape.getColor());
        }

        return colors;
    }
}


