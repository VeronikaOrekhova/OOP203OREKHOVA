package Singleton;

//Singleton
public class Moon {
    private static Moon instance;

    private Moon() {
        // приватный конструктор
    }

    public static synchronized Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}