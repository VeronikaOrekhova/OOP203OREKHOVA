import java.util.Arrays;
import java.util.List;

public class zadacha2block1{
    public static void main(String[] args) {
        List<String> surnames = Arrays.asList("Johnson", "Jackson", "Smith", "Jones", "Johnsonson");

        surnames.stream()
                .filter(surname -> surname.startsWith("J"))
                .forEach(System.out::println);
    }
}