/*Задачи на потоки данных Stream API
Блок 1
1. Для любого набора случайно-сгенерированных чисел нужно
определить количество парных. Для решения задачи
использовать средства программного интерфейса Stream API.*/
import java.util.Arrays;
import java.util.Random;

public class zadacha1block1 {
    public static void main(String[] args) {
        // Генерируем набор случайно-сгенерированных чисел
        Random random = new Random();
        int[] numbers = random.ints(10, 0, 100).toArray();

        // Используем Stream API для определения количества парных чисел
        long count = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("Количество парных чисел: " + count);
    }
}

