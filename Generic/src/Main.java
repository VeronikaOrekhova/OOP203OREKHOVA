public class Main {
    public static void main(String[] args) {
        // Создание анонимного класса, расширяющего интерфейс Printable
        Printable anonymousPrintable = new Printable() {
            @Override
            public void print() {
                System.out.println("Это анонимный класс, реализующий интерфейс Printable");
            }
        };

        // Вызов метода print() анонимного класса
        anonymousPrintable.print();



            Food food = new Food();

            Cookable cookable = new Cookable() {
                @Override
                public void cook(String str) {
                    System.out.println("Cooking " + str);
                }
            };

            food.prepare(cookable, "some food");


        Integer integer = 10;
        String string = "Hello";
        Double aDouble = 3.14;
        Animal animal = new Animal();

        MyClass<Integer, Animal, Double> myObject = new MyClass<>(integer, animal, aDouble);
        myObject.printClassNames();
        }
    }

