package Adapter;

public class ElectricCar implements ElectroCar {
    @Override
    public void charge() {
        System.out.println("Электромобиль заряжается...");
    }

    @Override
    public void discharge() {
        System.out.println("Электромобиль разряжается...");
    }

    @Override
    public void recharge() {
        System.out.println("Электромобиль перезаряжается...");
    }
}