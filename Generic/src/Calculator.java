import java.util.ArrayList;

//Калькулятор
public class Calculator {
    public static <T extends Number> double sum(T num1, T num2) {
        double result = num1.doubleValue() + num2.doubleValue();
        return result;
    }

    public static <T extends Number> double multiply(T num1, T num2) {
        double result = num1.doubleValue() * num2.doubleValue();
        return result;
    }

    public static <T extends Number> double divide(T num1, T num2) {
        double result = num1.doubleValue() / num2.doubleValue();
        return result;
    }

    public static <T extends Number> double subtraction(T num1, T num2) {
        double result = num1.doubleValue() - num2.doubleValue();
        return result;
    }

    public static void main(String[] args) {
        Integer num1 = 10;
        Double num2 = 5.5;

        Number sumResult = Calculator.sum(num1, num2);
        Number multiplyResult = Calculator.multiply(num1, num2);
        Number divideResult = Calculator.divide(num1, num2);
        Number subtractionResult = Calculator.subtraction(num1, num2);

        System.out.println("Sum: " + sumResult);
        System.out.println("Multiply: " + multiplyResult);
        System.out.println("Divide: " + divideResult);
        System.out.println("Subtraction: " + subtractionResult);
    }
}