
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;

 public class  zadacha2block2{
     public static void main(String[] args) {
         // Создаем список имен
         List<String> names = new ArrayList<>();
         names.add("Egor");
         names.add("");
         names.add("Max");
         names.add("Ivan");
         names.add("Petr");
         names.add("Patrick");

         // Приводим все непустые имена к верхнему регистру
         List<String> upperCaseNames = new ArrayList<>();
         for (String name : names) {
             if (!name.isEmpty()) {
                 upperCaseNames.add(name.toUpperCase());
             }
         }

         // Выводим все приведенные имена
         for (String upperCaseName : upperCaseNames) {
             System.out.println(upperCaseName);
         }

         // Считаем количество имен, начинающихся с определенной буквы
         Map<Character, Integer> nameCounts = new HashMap<>();
         char targetLetter = 'A'; // Задаем целевую букву
         for (String name : names) {
             if (!name.isEmpty() && name.charAt(0) == targetLetter) {
                 nameCounts.put(targetLetter, nameCounts.getOrDefault(targetLetter, 0) + 1);
             }
         }

         // Выводим количество имен, начинающихся с определенной буквы
         System.out.println("Количество имен, начинающихся с буквы " + targetLetter + ": " + nameCounts.getOrDefault(targetLetter, 0));
     }
 }
