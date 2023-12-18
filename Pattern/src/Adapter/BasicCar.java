package Adapter;

public class BasicCar implements Car {
    @Override
    public void accelerate() {
        System.out.println("Обычный автомобиль ускоряется...");
    }

    @Override
    public void brake() {
        System.out.println("Обычный автомобиль тормозит...");
    }

    @Override
    public void refuel() {
        System.out.println("Обычный автомобиль заправляется...");
    }
}