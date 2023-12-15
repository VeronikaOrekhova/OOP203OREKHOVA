import java.util.Arrays;
public class zadacha3block1 {
                public static void main(String[] args) {
                        String[] strings = {"hello", "world", "java", "stream", "api"};

                        Arrays.stream(strings)
                                .sorted()
                                .forEach(System.out::println);
                }
        }
