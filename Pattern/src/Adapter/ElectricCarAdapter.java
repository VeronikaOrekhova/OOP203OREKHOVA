package Adapter;

public class ElectricCarAdapter implements Car {
    private final ElectroCar electroCar;

    public ElectricCarAdapter(ElectroCar electroCar) {
        this.electroCar = electroCar;
    }

    @Override
    public void accelerate() {
        electroCar.charge();
    }

    @Override
    public void brake() {
        electroCar.discharge();
    }

    @Override
    public void refuel() {
        electroCar.recharge();
    }
}