public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + ", номер телефона: " + callerNumber);
    }

    public void sendMessage(String... phoneNumbers) {
        for (String phoneNumber : phoneNumbers) {
            System.out.println("Номер телефона: " + phoneNumber);
        }
    }

    // Getters and Setters for JavaBean convention

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Метод для вывода значений переменных на консоль
    public void printInfo() {
        System.out.println("Номер телефона: " + number);
        System.out.println("Модель: " + model);
        System.out.println("Вес: " + weight + " г");
        System.out.println();
    }

    public static void main(String[] args) {
        // Создание экземпляров класса
        Phone phone1 = new Phone("892763541", "Samsung Galaxy S20", 163.0);
        Phone phone2 = new Phone("899974851", "iPhone 14 pro", 164.0);
        Phone phone3 = new Phone("896412354", "Xiaomi Redmi Note 5a prime ", 199.0);

        // Вывод значений переменных на консоль
        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();
    }
}

