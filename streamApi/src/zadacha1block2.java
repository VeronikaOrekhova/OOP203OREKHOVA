import java.util.ArrayList;
        import java.util.List;
        import java.util.stream.Collectors;

public class zadacha1block2{

    public static void main(String[] args) {
        // Пример вызова метода и печати результатов
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        List<Integer> evenNumbers = findEvenNumbers(numbers);
        System.out.println("Четные числа: " + evenNumbers);
    }

    public static List<Integer> findEvenNumbers(List<Integer> numbers) {
        // Используем стрим для фильтрации четных чисел
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0) // Фильтруем четные числа
                .collect(Collectors.toList()); // Преобразуем стрим обратно в список

        return evenNumbers;
    }
}